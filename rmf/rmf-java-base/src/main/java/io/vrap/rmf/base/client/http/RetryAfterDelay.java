
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.http.HttpStatusCode.TOO_MANY_REQUESTS_429;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

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
            final long seconds = Long.parseLong(trimmed);
            return seconds > 0 ? Optional.of(Duration.ofSeconds(seconds)) : Optional.empty();
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

    public static Duration forContext(final ExecutionContext<ApiHttpResponse<byte[]>> context,
            final long initialDelayMillis, final long maxDelayMillis) {
        return forContext(context, initialDelayMillis, maxDelayMillis, Instant.now(), Math.random());
    }

    static Duration forContext(final ExecutionContext<ApiHttpResponse<byte[]>> context, final long initialDelayMillis,
            final long maxDelayMillis, final Instant now, final double random) {
        final Throwable failure = context.getLastException();

        Optional<Duration> delay = Optional.empty();
        if (failure instanceof ApiHttpException exception) {
            delay = of(exception.getHeaders(), exception.getStatusCode(), now);
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
        final long jittered = Math.round(delay.toMillis() * (1 + random * JITTER_FACTOR));
        return Duration.ofMillis(Math.min(jittered, maxDelayMillis));
    }
}
