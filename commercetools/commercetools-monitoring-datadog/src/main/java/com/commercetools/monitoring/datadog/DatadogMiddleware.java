
package com.commercetools.monitoring.datadog;

import static com.commercetools.monitoring.datadog.DatadogUtils.*;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.http.TelemetryMiddleware;

public class DatadogMiddleware implements TelemetryMiddleware {

    private final MetricsApi apiInstance;

    public DatadogMiddleware(final ApiClient ddApiClient) {
        this.apiInstance = new MetricsApi(ddApiClient);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        final Instant start = Instant.now();
        return next.apply(request).thenApply(response -> {
            try {
                submitClientDurationMetric(request, apiInstance, Duration.between(start, Instant.now()).toMillis(),
                    response);
                submitTotalRequestsMetric(request, apiInstance, response);

                if (response.getStatusCode() >= 400) {
                    submitErrorRequestsMetric(request, apiInstance, response);
                }
            }
            catch (ApiException e) {
                throw new RuntimeException(e);
            }
            return response;
        });
    }

}
