
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.http.HttpStatusCode.TOO_MANY_REQUESTS_429;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpResponse;

import dev.failsafe.ExecutionContext;

public final class RetryAfterDelay {

    private static final double JITTER_FACTOR = 0.25;

    private RetryAfterDelay() {
    }

    public static Optional<Duration> parse(@Nullable final String value, final Instant now) {
        final Optional<Duration> seconds = parseDeltaSeconds(value);
        if (seconds.isPresent()) {
            return seconds;
        }

        if (value == null || value.trim().isEmpty()) {
            return Optional.empty();
        }

        try {
            final Instant target = ZonedDateTime.parse(value.trim(), DateTimeFormatter.RFC_1123_DATE_TIME).toInstant();
            final Duration delay = Duration.between(now, target);
            return delay.isNegative() || delay.isZero() ? Optional.empty() : Optional.of(delay);
        }
        catch (final DateTimeParseException e) {
            return Optional.empty();
        }
    }

    static Optional<Duration> parseDeltaSeconds(@Nullable final String value) {
        if (value == null) {
            return Optional.empty();
        }

        final String trimmed = value.trim();
        if (trimmed.isEmpty() || !trimmed.chars().allMatch(Character::isDigit)) {
            return Optional.empty();
        }

        try {
            // only reachable with an all-digit string, so the value cannot be negative
            return Optional.of(Duration.ofSeconds(Long.parseLong(trimmed)));
        }
        catch (final NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static Optional<Duration> of(@Nullable final ApiHttpHeaders headers, final int statusCode,
            final Instant now) {
        if (headers == null) {
            return Optional.empty();
        }

        final Optional<Duration> retryAfter = parse(headers.getFirst(ApiHttpHeaders.RETRY_AFTER), now);
        if (retryAfter.isPresent()) {
            return retryAfter;
        }

        if (statusCode == TOO_MANY_REQUESTS_429) {
            final Optional<Duration> prefixed = parseDeltaSeconds(headers.getFirst(ApiHttpHeaders.X_RATE_LIMIT_RESET));
            if (prefixed.isPresent()) {
                return prefixed;
            }
            // cloud-tools intends to drop the X- prefix (CLT-2648), so reading both
            return parseDeltaSeconds(headers.getFirst(ApiHttpHeaders.RATE_LIMIT_RESET));
        }
        return Optional.empty();
    }

    public static boolean hasTiming(@Nullable final ApiHttpHeaders headers, final int statusCode) {
        return of(headers, statusCode, Instant.now()).isPresent();
    }

    public static Optional<Duration> of(@Nonnull final ApiHttpException exception, final Instant now) {
        final Optional<Duration> fromResponse = Optional.ofNullable(exception.getResponse())
                .flatMap(response -> of(response.getHeaders(), exception.getStatusCode(), now));

        if (fromResponse.isPresent()) {
            return fromResponse;
        }

        return of(exception.getHeaders(), exception.getStatusCode(), now);
    }

    public static boolean hasTiming(final ApiHttpException exception) {
        return of(exception, Instant.now()).isPresent();
    }

    /**
     * Whether a rate-limited response can usefully be retried within the configured maximum delay.
     *
     * <p>
     * A rate limit window is a hard boundary: until it resets, every request is rejected. So if the
     * server asks for longer than we are willing to wait, capping the delay does not salvage the
     * retry — it guarantees the next attempt lands inside the same window and fails again, and the
     * one after that, until the budget is gone. The caller ends up waiting
     * {@code maxRetries * maxDelay} and still gets the error, having added load to a server that
     * was already shedding it.
     *
     * <p>
     * Failing immediately is more useful: the caller gets the {@code 429} straight away and can
     * decide what to do with it, rather than being blocked on attempts that cannot succeed.
     *
     * <p>
     * This applies to {@code 429} only. A {@code Retry-After} on a {@code 503} is the server's
     * estimate of when it might recover, not a hard boundary, so an early retry there may well
     * succeed and the delay is capped rather than abandoned.
     *
     * @return {@code false} when there is no timing header at all, or when the wait it asks for
     *         exceeds {@code maxDelayMillis}
     */
    public static boolean canRetryWithin(@Nullable final ApiHttpHeaders headers, final int statusCode,
            final long maxDelayMillis) {
        return withinMaxDelay(of(headers, statusCode, Instant.now()), maxDelayMillis);
    }

    /**
     * @see #canRetryWithin(ApiHttpHeaders, int, long)
     */
    public static boolean canRetryWithin(final ApiHttpException exception, final long maxDelayMillis) {
        return withinMaxDelay(of(exception, Instant.now()), maxDelayMillis);
    }

    private static boolean withinMaxDelay(final Optional<Duration> delay, final long maxDelayMillis) {
        final Duration max = Duration.ofMillis(maxDelayMillis);
        // Compared as Durations rather than millis: `toMillis()` throws on overflow, and an absurd
        // header can produce a Duration too large to express in milliseconds.
        return delay.map(d -> d.compareTo(max) <= 0).orElse(false);
    }

    public static Duration forContext(final ExecutionContext<ApiHttpResponse<byte[]>> context,
            final long initialDelayMillis, final long maxDelayMillis) {
        return forContext(context, initialDelayMillis, maxDelayMillis, Instant.now(), Math.random());
    }

    static Duration forContext(final ExecutionContext<ApiHttpResponse<byte[]>> context, final long initialDelayMillis,
            final long maxDelayMillis, final Instant now, final double random) {
        final Throwable failure = context.getLastException();

        Optional<Duration> delay = Optional.empty();
        if (failure instanceof ApiHttpException exception) {
            delay = of(exception, now);
        }

        if (delay.isEmpty()) {
            final ApiHttpResponse<byte[]> response = context.getLastResult();
            if (response != null) {
                delay = of(response.getHeaders(), response.getStatusCode(), now);
            }
        }

        if (delay.isPresent()) {
            return withJitterAndCap(delay.get(), maxDelayMillis, random);
        }

        return exponentialBackoff(context.getAttemptCount(), initialDelayMillis, maxDelayMillis, random);
    }

    static Duration exponentialBackoff(final int attemptCount, final long initialDelayMillis, final long maxDelayMillis,
            final double random) {
        final int exponent = Math.max(0, attemptCount - 1);
        final double unbounded = initialDelayMillis * Math.pow(2, Math.min(exponent, 62));
        final long capped = (long) Math.min(unbounded, maxDelayMillis);

        final long jittered = Math.round(capped * (1 + (random * 2 - 1) * 0.25));

        return Duration.ofMillis(Math.max(0, Math.min(jittered, maxDelayMillis)));
    }

    static Duration withJitterAndCap(final Duration delay, final long maxDelayMillis, final double random) {
        final Duration max = Duration.ofMillis(maxDelayMillis);

        if (delay.compareTo(max) >= 0) {
            return max;
        }

        final long jittered = Math.round(delay.toMillis() * (1 + random * JITTER_FACTOR));
        return Duration.ofMillis(Math.min(jittered, maxDelayMillis));
    }
}
