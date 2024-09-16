
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DataProviderExtension.class)
@ExtendWith(UseDataProviderExtension.class)
public class TelemetryMiddlewareTest {

    @DataProvider
    public static Object[][] responses() {
        return new Object[][] { { 200, 1, 0 }, { 201, 1, 0 }, { 400, 1, 1 }, { 401, 1, 1 }, { 403, 1, 1 },
                { 404, 1, 1 }, { 409, 1, 1 }, { 499, 1, 1 }, { 500, 1, 1 }, { 502, 1, 1 }, { 503, 1, 1 }, { 504, 1, 1 },
                { 599, 1, 1 }, };
    }

    @TestTemplate
    @UseDataProvider("responses")
    public void testCounts(int statusCode, int count, int errorCount) {
        TestTelemetryMiddleware middleware = new TestTelemetryMiddleware();

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"), new ApiHttpHeaders(),
            "".getBytes());

        blockingWait(
            middleware.invoke(request,
                request1 -> CompletableFuture
                        .completedFuture(new ApiHttpResponse<>(statusCode, new ApiHttpHeaders(), "".getBytes()))),
            Duration.ofSeconds(1));

        Assertions.assertThat(middleware.count).isEqualTo(count);
        Assertions.assertThat(middleware.errorCount).isEqualTo(errorCount);
    }

    @TestTemplate
    @UseDataProvider("responses")
    public void testHttpCounts(int statusCode, int count, int errorCount) throws URISyntaxException {
        TestTelemetryMiddleware middleware = new TestTelemetryMiddleware();

        ApiHttpClient client = ClientBuilder
                .of(new TestHttpClient(request -> CompletableFuture
                        .completedFuture(new ApiHttpResponse<>(statusCode, new ApiHttpHeaders(), "".getBytes()))))
                .withApiBaseUrl(new URI(""))
                .withTelemetryMiddleware(middleware)
                .withErrorMiddleware()
                .build();

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"), new ApiHttpHeaders(),
            "".getBytes());
        try {
            blockingWait(client.execute(request), Duration.ofSeconds(1));
        }
        catch (ApiHttpException ignored) {
        }

        Assertions.assertThat(middleware.count).isEqualTo(count);
        Assertions.assertThat(middleware.errorCount).isEqualTo(errorCount);
    }

    static class TestHttpClient implements VrapHttpClient {
        private final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next;

        public TestHttpClient(Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
            this.next = next;
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            return next.apply(request);
        }
    }

    static class TestTelemetryMiddleware implements TelemetryMiddleware {

        public long count = 0;
        public long errorCount = 0;
        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
                Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
            return next.apply(request).thenApply(response -> {
                count++;
                if (response.getStatusCode() >= 400) {
                    errorCount++;
                }
                return response;
            });
        }
    }
}
