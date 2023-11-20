
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;
import static java.util.Collections.singletonList;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicInteger;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.failsafe.TimeoutBuilder;

public class PolicyMiddlewareTest {

    @Test
    public void testWithStatusCode() {
        PolicyMiddleware middleware = PolicyBuilder.of().withRetry(1).build();

        final ApiHttpRequest request = new ApiHttpRequest();
        AtomicInteger count = new AtomicInteger();

        final ApiHttpResponse<byte[]> apiHttpResponse = blockingWait(middleware.invoke(request, request1 -> {
            count.getAndIncrement();
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(503, null, null));
        }), Duration.ofSeconds(1));
        Assertions.assertThat(apiHttpResponse.getStatusCode()).isEqualTo(503);
        Assertions.assertThat(count.get()).isEqualTo(2);
    }

    @Test
    public void testWithCoveredException() {
        PolicyMiddleware middleware = PolicyBuilder.of().withRetry(1).build();

        final URI uri = URI.create("https://www.commercetools.com/");

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, uri, null, null);
        AtomicInteger count = new AtomicInteger();

        Assertions.assertThatExceptionOfType(ApiHttpException.class).isThrownBy(() -> {
            blockingWait(middleware.invoke(request, request1 -> {
                count.getAndIncrement();
                return CompletableFuture.supplyAsync(() -> {
                    throw new CompletionException(new ApiHttpException(503, null, null, null, null, request));
                });
            }), Duration.ofSeconds(1));
        }).matches(e -> e.getStatusCode() == 503);
        Assertions.assertThat(count.get()).isEqualTo(2);
    }

    @Test
    public void testWithCoveredExceptionResponse() {
        PolicyMiddleware middleware = PolicyBuilder.of().withRetry(1).build();

        final URI uri = URI.create("https://www.commercetools.com/");

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, uri, null, null);
        AtomicInteger count = new AtomicInteger();
        final ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(503, new ApiHttpHeaders(),
            "{\"hello\": \"world\"}".getBytes(StandardCharsets.UTF_8), "Oops!");
        Assertions.assertThatExceptionOfType(ApiHttpException.class).isThrownBy(() -> {
            blockingWait(middleware.invoke(request, request1 -> {
                count.getAndIncrement();
                return CompletableFuture.supplyAsync(() -> {
                    throw new CompletionException(new ApiHttpException(503, null, null, null, response, request));
                });
            }), Duration.ofSeconds(1));
        }).matches(e -> e.getStatusCode() == 503);
        Assertions.assertThat(count.get()).isEqualTo(2);
    }

    @Test
    public void testUncoveredException() {
        PolicyMiddleware middleware = PolicyBuilder.of().withRetry(1).build();

        final ApiHttpRequest request = new ApiHttpRequest();
        AtomicInteger count = new AtomicInteger();

        Assertions.assertThatExceptionOfType(ApiHttpException.class).isThrownBy(() -> {
            blockingWait(middleware.invoke(request, request1 -> {
                count.getAndIncrement();
                return CompletableFuture.supplyAsync(() -> {
                    throw new CompletionException(new ApiHttpException(504, null, null, null, null, request));
                });
            }), Duration.ofSeconds(1));
        }).matches(e -> e.getStatusCode() == 504);
        Assertions.assertThat(count.get()).isEqualTo(1);
    }

    @Test
    public void testRetrySuccess() {
        PolicyMiddleware middleware = PolicyBuilder.of().withRetry(1).build();

        final ApiHttpRequest request = new ApiHttpRequest();
        AtomicInteger count = new AtomicInteger();

        final ApiHttpResponse<byte[]> apiHttpResponse = blockingWait(middleware.invoke(request, request1 -> {
            count.getAndIncrement();
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(200, null, null));
        }), Duration.ofSeconds(1));
        Assertions.assertThat(apiHttpResponse.getStatusCode()).isEqualTo(200);
        Assertions.assertThat(count.get()).isEqualTo(1);
    }

    public void retryConfigurationStatusCodes() {
        final ApiHttpClient build = ClientBuilder.of()
                // ...
                .withPolicies(policyBuilder -> policyBuilder.withRetry(retry -> retry.maxRetries(3)
                        .statusCodes(Arrays.asList(HttpStatusCode.SERVICE_UNAVAILABLE_503,
                            HttpStatusCode.INTERNAL_SERVER_ERROR_500))))
                .build();
    }

    public void retryConfigurationExceptions() {
        final ApiHttpClient build = ClientBuilder.of()
                // ...
                .withPolicies(policyBuilder -> policyBuilder
                        .withRetry(retry -> retry.maxRetries(3).failures(singletonList(JsonException.class))))
                .build();
    }

    public void queueConfiguration() {
        final ApiHttpClient build = ClientBuilder.of()
                // ...
                .withPolicies(policyBuilder -> policyBuilder.withBulkhead(64, Duration.ofSeconds(10)))
                .build();
    }

    public void timeoutConfiguration() {
        final ApiHttpClient build = ClientBuilder.of()
                // ...
                .withPolicies(
                    policyBuilder -> policyBuilder.withTimeout(Duration.ofSeconds(10), TimeoutBuilder::withInterrupt))
                .build();
    }
}
