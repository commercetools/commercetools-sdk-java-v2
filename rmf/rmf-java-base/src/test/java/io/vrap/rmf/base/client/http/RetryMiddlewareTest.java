
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicInteger;

import io.vrap.rmf.base.client.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RetryMiddlewareTest {

    @Test
    public void testWithStatusCode() {
        RetryMiddleware middleware = new RetryMiddleware(1);

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
        RetryMiddleware middleware = new RetryMiddleware(1);

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
        RetryMiddleware middleware = new RetryMiddleware(1);

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
        RetryMiddleware middleware = new RetryMiddleware(1);

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
        RetryMiddleware middleware = new RetryMiddleware(1);

        final ApiHttpRequest request = new ApiHttpRequest();
        AtomicInteger count = new AtomicInteger();

        final ApiHttpResponse<byte[]> apiHttpResponse = blockingWait(middleware.invoke(request, request1 -> {
            count.getAndIncrement();
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(200, null, null));
        }), Duration.ofSeconds(1));
        Assertions.assertThat(apiHttpResponse.getStatusCode()).isEqualTo(200);
        Assertions.assertThat(count.get()).isEqualTo(1);
    }
}
