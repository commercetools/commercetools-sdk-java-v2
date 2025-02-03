
package com.commercetools.monitoring.datadog;

import static com.commercetools.monitoring.datadog.DatadogUtils.*;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.http.TelemetryMiddleware;

/**
 * <p>The DatadogTelemetry middleware can be used to report outgoing request to commercetools to Datadog.
 * This middleware uses Datadog API to submit telemetry data.
 * It can be registered as TelemetryMiddleware to the {@link io.vrap.rmf.base.client.ClientBuilder#withTelemetryMiddleware(TelemetryMiddleware) ClientBuilder}
 * or the ApiRootBuilder.</p>
 *
 * {@include.example example.DatadogApiRootBuilderTest#addDatadogTelemetry()}
 *
 * The middleware adds the following metrics to Datadog:
 * <ul>
 *     <li>commercetools.client.duration: The duration of the request in milliseconds</li>
 *     <li>commercetools.client.total_requests: The total number of requests</li>
 *     <li>commercetools.client.error_requests: The total number of requests with a status code greater or equal to 400</li>
 * </ul>
 *
 * <p>The metrics are enriched with the response status code, server address, port and request method.</p>
 *
 * <p>See also the <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/examples/spring-datadog">Spring MVC example application</a> in the examples folder for further details.</p>
 */
public class DatadogMiddleware implements TelemetryMiddleware {

    private final MetricsApi apiInstance;

    public DatadogMiddleware(final ApiClient ddApiClient) {
        this.apiInstance = new MetricsApi(ddApiClient);
    }

    public DatadogMiddleware(final MetricsApi apiInstance) {
        this.apiInstance = apiInstance;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        final Instant start = Instant.now();
        return next.apply(request).handle((response, throwable) -> {
            final int statusCode;
            if (response != null) {
                statusCode = response.getStatusCode();
            }
            else if (throwable instanceof ApiHttpException && ((ApiHttpException) throwable).getResponse() != null) {
                statusCode = ((ApiHttpException) throwable).getResponse().getStatusCode();
            }
            else {
                statusCode = 0;
            }
            try {
                submitClientDurationMetric(request, apiInstance, Duration.between(start, Instant.now()).toMillis(),
                    statusCode);
                submitTotalRequestsMetric(request, apiInstance, statusCode);
                if (statusCode >= 400 || throwable != null) {
                    submitErrorRequestsMetric(request, apiInstance, statusCode);
                }
            }
            catch (ApiException e) {
                throw new RuntimeException(e);
            }
            return response;
        });
    }

}
