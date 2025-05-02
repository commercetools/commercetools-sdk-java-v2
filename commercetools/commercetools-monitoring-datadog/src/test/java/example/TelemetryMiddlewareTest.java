
package example;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.commercetools.monitoring.datadog.DatadogMiddleware;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;

import io.vrap.rmf.base.client.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

public class TelemetryMiddlewareTest {

    public static Object[][] responses() {
        return new Object[][] { { 200, 2 }, { 201, 2 }, { 400, 3 }, { 401, 3 }, { 403, 3 }, { 404, 3 }, { 409, 3 },
                { 499, 3 }, { 500, 3 }, { 502, 3 }, { 503, 3 }, { 504, 3 }, { 599, 3 }, };
    }

    @ParameterizedTest
    @MethodSource("responses")
    public void testCounts(int statusCode, int count) throws ApiException {
        MetricsApi metricsApi = Mockito.mock(MetricsApi.class);
        Mockito.when(metricsApi.submitMetrics(Mockito.any())).thenReturn(null);
        DatadogMiddleware middleware = new DatadogMiddleware(metricsApi);

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"), new ApiHttpHeaders(),
            "".getBytes());

        blockingWait(
            middleware.invoke(request,
                request1 -> CompletableFuture
                        .completedFuture(new ApiHttpResponse<>(statusCode, new ApiHttpHeaders(), "".getBytes()))),
            Duration.ofSeconds(1));

        Mockito.verify(metricsApi, Mockito.times(count)).submitMetrics(Mockito.argThat(metricPayload -> {
            Assertions.assertThat(metricPayload).isNotNull();
            Assertions.assertThat(metricPayload.getSeries().get(0).getMetric())
                    .isIn("commercetools.client.duration", "commercetools.client.request.total",
                        "commercetools.client.request.error");
            return true;
        }));
    }

    @ParameterizedTest
    @MethodSource("responses")
    public void testHttpCounts(int statusCode, int count) throws URISyntaxException, ApiException {
        MetricsApi metricsApi = Mockito.mock(MetricsApi.class);
        Mockito.when(metricsApi.submitMetrics(Mockito.any())).thenReturn(null);
        DatadogMiddleware middleware = new DatadogMiddleware(metricsApi);

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

        Mockito.verify(metricsApi, Mockito.times(count)).submitMetrics(Mockito.argThat(metricPayload -> {
            Assertions.assertThat(metricPayload).isNotNull();
            Assertions.assertThat(metricPayload.getSeries().get(0).getMetric())
                    .isIn("commercetools.client.duration", "commercetools.client.request.total",
                        "commercetools.client.request.error");
            return true;
        }));
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
}
