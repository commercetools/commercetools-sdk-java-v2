
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicInteger;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RetryAfterDelayTest {
    private static final Instant TIME = Instant.parse("2026-10-21T07:28:00Z");

    private static ApiHttpHeaders headers(final String key, final String value) {
        return new ApiHttpHeaders().withHeader(key, value);
    }

    @Test
    public void testParsesDeltaSeconds() {
        Assertions.assertThat(RetryAfterDelay.parse("120", TIME)).contains(Duration.ofSeconds(120));
    }

    @Test
    public void testSurroundingWhitespace() {
        Assertions.assertThat(RetryAfterDelay.parse("  30  ", TIME)).contains(Duration.ofSeconds(30));
    }

    @Test
    public void testZeroSeconds() {
        // RFC 9110 delta-seconds is non-negative, so 0 is possible and means retry now
        Assertions.assertThat(RetryAfterDelay.parse("0", TIME)).contains(Duration.ZERO);
        Assertions.assertThat(RetryAfterDelay.hasTiming(headers(ApiHttpHeaders.RETRY_AFTER, "0"), 429)).isTrue();
    }

    @Test
    public void testParseHttpDateInTheFuture() {
        Assertions.assertThat(RetryAfterDelay.parse("Wed, 21 Oct 2026 07:28:30 GMT", TIME))
                .contains(Duration.ofSeconds(30));
    }

    @Test
    public void testIgnoreHttpDateInThePast() {
        Assertions.assertThat(RetryAfterDelay.parse("Wed, 21 Oct 2026 07:27:00 GMT", TIME)).isEmpty();
    }

    @Test
    public void testIgnoreMalformedValues() {
        Assertions.assertThat(RetryAfterDelay.parse(null, TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.parse("", TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.parse("   ", TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.parse("soon", TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.parse("-5", TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.parse("1.5", TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.parse("Not, 99 Xxx 2026 99:99:99 GMT", TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.parse("99999999999999999999999999", TIME)).isEmpty();
    }

    @Test
    public void testReadRetryAfterOnAnyStatus() {
        Assertions.assertThat(RetryAfterDelay.of(headers(ApiHttpHeaders.RETRY_AFTER, "5"), 429, TIME))
                .contains(Duration.ofSeconds(5));
    }

    @Test
    public void testReadRateLimitReset() {
        // the gateway sends this in current version, because Envoy cannot send Retry-After
        Assertions.assertThat(RetryAfterDelay.of(headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "40"), 429, TIME))
                .contains(Duration.ofSeconds(40));
    }

    @Test
    public void testIgnoreRateLimitResetWhenNotRateLimited() {
        Assertions.assertThat(RetryAfterDelay.of(headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "40"), 200, TIME))
                .isEmpty();
        Assertions.assertThat(RetryAfterDelay.of(headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "60"), 404, TIME))
                .isEmpty();
        Assertions.assertThat(RetryAfterDelay.of(headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "60"), 503, TIME))
                .isEmpty();
    }

    @Test
    public void testReadUnprefixedRateLimitReset() {
        // cloud-tools intends to drop the X- prefix(CLT-2648). Handling both, so that change doesn't silently disable rate limit in SDK
        Assertions.assertThat(RetryAfterDelay.of(headers(ApiHttpHeaders.RATE_LIMIT_RESET, "40"), 429, TIME))
                .contains(Duration.ofSeconds(40));
    }

    @Test
    public void testChooseThePrefixedFormWhenBothSent() {
        final ApiHttpHeaders both = new ApiHttpHeaders().withHeader(ApiHttpHeaders.X_RATE_LIMIT_RESET, "40")
                .withHeader(ApiHttpHeaders.RATE_LIMIT_RESET, "90");
        Assertions.assertThat(RetryAfterDelay.of(both, 429, TIME)).contains(Duration.ofSeconds(40));
    }

    @Test
    public void testIgnoreUnprefixedRateLimitResetWhenNotRateLimited() {
        Assertions.assertThat(RetryAfterDelay.of(headers(ApiHttpHeaders.RATE_LIMIT_RESET, "40"), 200, TIME)).isEmpty();
    }

    @Test
    public void testCheckRetryAfterBeforeRateLimitReset() {
        final ApiHttpHeaders both = new ApiHttpHeaders().withHeader(ApiHttpHeaders.RETRY_AFTER, "5")
                .withHeader(ApiHttpHeaders.X_RATE_LIMIT_RESET, "40");
        Assertions.assertThat(RetryAfterDelay.of(both, 429, TIME)).contains(Duration.ofSeconds(5));
    }

    @Test
    public void testReadHeadersCaseInsensitively() {
        Assertions.assertThat(RetryAfterDelay.of(headers("retry-after", "5"), 429, TIME))
                .contains(Duration.ofSeconds(5));
        Assertions.assertThat(RetryAfterDelay.of(headers("x-ratelimit-reset", "40"), 429, TIME))
                .contains(Duration.ofSeconds(40));
    }

    @Test
    public void testMissingHeaders() {
        Assertions.assertThat(RetryAfterDelay.of(new ApiHttpHeaders(), 429, TIME)).isEmpty();
        Assertions.assertThat(RetryAfterDelay.of(null, 429, TIME)).isEmpty();
    }

    @Test
    public void testResponseHeadersNotExceptionHeaders() {
        final ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(429,
            headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "40"), null);
        final ApiHttpException exception = new ApiHttpException(429, null, new ApiHttpHeaders(), null, response);

        Assertions.assertThat(RetryAfterDelay.of(exception, TIME)).contains(Duration.ofSeconds(40));
        Assertions.assertThat(RetryAfterDelay.hasTiming(exception)).isTrue();
    }

    @Test
    public void testExceptionHeadersWithoutAResponse() {
        final ApiHttpException exception = new ApiHttpException(429, "",
            headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "40"), "", null);

        Assertions.assertThat(RetryAfterDelay.of(exception, TIME)).contains(Duration.ofSeconds(40));
    }

    @Test
    public void testRetryAfterOn503Response() {
        final ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(503, headers(ApiHttpHeaders.RETRY_AFTER, "15"),
            null);
        final ApiHttpException exception = new ApiHttpException(503, "", new ApiHttpHeaders(), "", response);

        Assertions.assertThat(RetryAfterDelay.of(exception, TIME)).contains(Duration.ofSeconds(15));
    }

    @Test
    public void testNoTimingWhenNeitherSourceHasAHeader() {
        final ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(429, new ApiHttpHeaders(), null);
        final ApiHttpException exception = new ApiHttpException(429, "", new ApiHttpHeaders(), "", response);

        Assertions.assertThat(RetryAfterDelay.hasTiming(exception)).isFalse();
    }

    // Aborting instead of capping, when the server asks for longer than max wait duration
    @Test
    public void testCanRetryTheWaitFitsWithinMaxDelay() {
        Assertions
                .assertThat(
                    RetryAfterDelay.canRetryWithin(headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "30"), 429, 60000))
                .isTrue();
    }

    @Test
    public void testCannotRetryTheWaitExceedsMaxDelay() {
        Assertions.assertThat(RetryAfterDelay.canRetryWithin(headers(ApiHttpHeaders.RETRY_AFTER, "120"), 429, 60000))
                .isFalse();
    }

    @Test
    public void testCannotRetryWithoutTimingHeader() {
        Assertions.assertThat(RetryAfterDelay.canRetryWithin(new ApiHttpHeaders(), 429, 60000)).isFalse();
    }

    @Test
    public void testCanRetryTheWaitEqualsMaxDelay() {
        Assertions.assertThat(RetryAfterDelay.canRetryWithin(headers(ApiHttpHeaders.RETRY_AFTER, "60"), 429, 60000))
                .isTrue();
    }

    @Test
    public void testHugeWaitDoesNotOverflowTheComparison() {
        Assertions
                .assertThatCode(() -> RetryAfterDelay.canRetryWithin(
                    headers(ApiHttpHeaders.RETRY_AFTER, String.valueOf(Long.MAX_VALUE)), 429, 60000))
                .doesNotThrowAnyException();
        Assertions
                .assertThat(RetryAfterDelay.canRetryWithin(
                    headers(ApiHttpHeaders.RETRY_AFTER, String.valueOf(Long.MAX_VALUE)), 429, 60000))
                .isFalse();
    }

    // Jitter tests
    @Test
    public void testRetryAfterIsNotOverflowed() {
        Assertions.assertThat(RetryAfterDelay.withJitterAndCap(Duration.ofSeconds(Long.MAX_VALUE), 60000, 0.5))
                .isEqualTo(Duration.ofMillis(60000));
    }

    @Test
    public void testRetryAfterHeaderNoException() {
        final ApiHttpHeaders huge = headers(ApiHttpHeaders.RETRY_AFTER, String.valueOf(Long.MAX_VALUE));
        final Optional<Duration> parsed = RetryAfterDelay.of(huge, 429, TIME);

        Assertions.assertThat(parsed).isPresent();
        Assertions.assertThatCode(() -> RetryAfterDelay.withJitterAndCap(parsed.get(), 60000, 0.5))
                .doesNotThrowAnyException();
    }

    @Test
    public void testNeverRetriesEarlierThanInstructed() {
        for (int i = 0; i < 100; i++) {
            Assertions
                    .assertThat(RetryAfterDelay.withJitterAndCap(Duration.ofSeconds(10), Long.MAX_VALUE, Math.random()))
                    .isGreaterThanOrEqualTo(Duration.ofSeconds(10));
        }
    }

    @Test
    public void testMostTwentyFivePercentJitter() {
        Assertions.assertThat(RetryAfterDelay.withJitterAndCap(Duration.ofSeconds(10), Long.MAX_VALUE, 1.0))
                .isEqualTo(Duration.ofMillis(12500));
    }

    @Test
    public void testCapAtMaxDelay() {
        Assertions.assertThat(RetryAfterDelay.withJitterAndCap(Duration.ofSeconds(86400), 60000, 0.0))
                .isEqualTo(Duration.ofMillis(60000));
    }

    // Backoff fallback
    @Test
    public void testBackoffDoublesPerAttempt() {
        // random 0.5 means no jitter, since Failsafe's jitter is symmetric
        Assertions.assertThat(RetryAfterDelay.exponentialBackoff(1, 200, 60000, 0.5)).isEqualTo(Duration.ofMillis(200));
        Assertions.assertThat(RetryAfterDelay.exponentialBackoff(2, 200, 60000, 0.5)).isEqualTo(Duration.ofMillis(400));
        Assertions.assertThat(RetryAfterDelay.exponentialBackoff(3, 200, 60000, 0.5)).isEqualTo(Duration.ofMillis(800));
    }

    @Test
    public void testBackoffJitterSymmetric() {
        Assertions.assertThat(RetryAfterDelay.exponentialBackoff(1, 200, 60000, 0.0)).isEqualTo(Duration.ofMillis(150));
        Assertions.assertThat(RetryAfterDelay.exponentialBackoff(1, 200, 60000, 1.0)).isEqualTo(Duration.ofMillis(250));
    }

    @Test
    public void testBackoffCappedAtMaxDelay() {
        Assertions.assertThat(RetryAfterDelay.exponentialBackoff(30, 200, 60000, 0.5))
                .isEqualTo(Duration.ofMillis(60000));
    }

    @Test
    public void testBackoffNeverNegativeOrOverflows() {
        for (int attempt = 0; attempt < 200; attempt++) {
            final Duration d = RetryAfterDelay.exponentialBackoff(attempt, 200, 60000, Math.random());
            Assertions.assertThat(d).isBetween(Duration.ZERO, Duration.ofMillis(60000));
        }
    }

    // Failsafe
    @Test
    public void testNoRetryWhen429AsksForLongerThanMaxDelay() {
        final PolicyMiddleware middleware = PolicyBuilder.of()
                .withRetry(builder -> builder.maxRetries(3).initialDelay(10).maxDelay(100))
                .build();
        final ApiHttpRequest request = new ApiHttpRequest();
        final AtomicInteger count = new AtomicInteger();

        final ApiHttpResponse<byte[]> response = blockingWait(middleware.invoke(request, req -> {
            count.getAndIncrement();
            return CompletableFuture
                    .completedFuture(new ApiHttpResponse<>(429, headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "1"), null));
        }), Duration.ofSeconds(10));

        Assertions.assertThat(response.getStatusCode()).isEqualTo(429);
        Assertions.assertThat(count.get()).isEqualTo(1);
    }

    @Test
    public void test503StillCapsRatherThanGivingUp() {
        // Retry-After for 503 is an estimate, so an early retry works
        final PolicyMiddleware middleware = PolicyBuilder.of()
                .withRetry(builder -> builder.maxRetries(1).initialDelay(10).maxDelay(100))
                .build();
        final ApiHttpRequest request = new ApiHttpRequest();
        final AtomicInteger count = new AtomicInteger();

        final Instant start = Instant.now();
        final ApiHttpResponse<byte[]> response = blockingWait(middleware.invoke(request, req -> {
            count.getAndIncrement();
            return CompletableFuture
                    .completedFuture(new ApiHttpResponse<>(503, headers(ApiHttpHeaders.RETRY_AFTER, "1"), null));
        }), Duration.ofSeconds(10));
        final Duration elapsed = Duration.between(start, Instant.now());

        Assertions.assertThat(response.getStatusCode()).isEqualTo(503);
        Assertions.assertThat(count.get()).isEqualTo(2);
        // capped at 100ms rather than waiting the full second
        Assertions.assertThat(elapsed).isLessThan(Duration.ofMillis(900));
    }

    @Test
    public void testRateLimitResetOnRawResponse() {
        final PolicyMiddleware middleware = PolicyBuilder.of().withRetry(builder -> builder.maxRetries(1)).build();
        final ApiHttpRequest request = new ApiHttpRequest();
        final AtomicInteger count = new AtomicInteger();

        final Instant start = Instant.now();
        final ApiHttpResponse<byte[]> response = blockingWait(middleware.invoke(request, req -> {
            count.getAndIncrement();
            return CompletableFuture
                    .completedFuture(new ApiHttpResponse<>(429, headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "1"), null));
        }), Duration.ofSeconds(10));
        final Duration elapsed = Duration.between(start, Instant.now());

        Assertions.assertThat(response.getStatusCode()).isEqualTo(429);
        Assertions.assertThat(count.get()).isEqualTo(2);
        // Default backoff would have waited around 200ms, but the header sets 1s
        Assertions.assertThat(elapsed).isGreaterThanOrEqualTo(Duration.ofMillis(1000));
    }

    @Test
    public void testRetryAfterOnApiHttpException() {
        final PolicyMiddleware middleware = PolicyBuilder.of().withRetry(builder -> builder.maxRetries(1)).build();
        final ApiHttpRequest request = new ApiHttpRequest();
        final AtomicInteger count = new AtomicInteger();

        final Instant start = Instant.now();
        Assertions.assertThatExceptionOfType(ApiHttpException.class).isThrownBy(() -> {
            blockingWait(middleware.invoke(request, req -> {
                count.getAndIncrement();
                return CompletableFuture.supplyAsync(() -> {
                    throw new CompletionException(
                        new ApiHttpException(429, null, headers(ApiHttpHeaders.RETRY_AFTER, "1"), null, null, request));
                });
            }), Duration.ofSeconds(10));
        }).matches(e -> e.getStatusCode() == 429);
        final Duration elapsed = Duration.between(start, Instant.now());

        Assertions.assertThat(count.get()).isEqualTo(2);
        Assertions.assertThat(elapsed).isGreaterThanOrEqualTo(Duration.ofMillis(1000));
    }

    @Test
    public void testNoRetry429WithoutTimingHeader() {
        final PolicyMiddleware middleware = PolicyBuilder.of().withRetry(builder -> builder.maxRetries(3)).build();
        final ApiHttpRequest request = new ApiHttpRequest();
        final AtomicInteger count = new AtomicInteger();

        final ApiHttpResponse<byte[]> response = blockingWait(middleware.invoke(request, req -> {
            count.getAndIncrement();
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(429, new ApiHttpHeaders(), null));
        }), Duration.ofSeconds(10));

        Assertions.assertThat(response.getStatusCode()).isEqualTo(429);
        Assertions.assertThat(count.get()).isEqualTo(1);
    }

    @Test
    public void testRetries503WithBackoff() {
        final PolicyMiddleware middleware = PolicyBuilder.of().withRetry(builder -> builder.maxRetries(1)).build();
        final ApiHttpRequest request = new ApiHttpRequest();
        final AtomicInteger count = new AtomicInteger();

        final Instant start = Instant.now();
        final ApiHttpResponse<byte[]> response = blockingWait(middleware.invoke(request, req -> {
            count.getAndIncrement();
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(503, new ApiHttpHeaders(), null));
        }), Duration.ofSeconds(10));
        final Duration elapsed = Duration.between(start, Instant.now());

        Assertions.assertThat(response.getStatusCode()).isEqualTo(503);
        Assertions.assertThat(count.get()).isEqualTo(2);
        // initial delay is 200ms, minus up to 25% jitter
        Assertions.assertThat(elapsed).isGreaterThanOrEqualTo(Duration.ofMillis(140));
        Assertions.assertThat(elapsed).isLessThan(Duration.ofMillis(1000));
    }

    @Test
    public void testConsumerSuppliedDelayFn() {
        final PolicyMiddleware middleware = PolicyBuilder.of()
                .withRetry(builder -> builder.maxRetries(1)
                        .options(options -> options.withDelayFn(context -> Duration.ofMillis(1))))
                .build();
        final ApiHttpRequest request = new ApiHttpRequest();
        final AtomicInteger count = new AtomicInteger();

        final Instant start = Instant.now();
        blockingWait(middleware.invoke(request, req -> {
            count.getAndIncrement();
            return CompletableFuture.completedFuture(
                new ApiHttpResponse<>(429, headers(ApiHttpHeaders.X_RATE_LIMIT_RESET, "30"), null));
        }), Duration.ofSeconds(10));
        final Duration elapsed = Duration.between(start, Instant.now());

        Assertions.assertThat(count.get()).isEqualTo(2);
        Assertions.assertThat(elapsed).isLessThan(Duration.ofSeconds(5));
    }
}
