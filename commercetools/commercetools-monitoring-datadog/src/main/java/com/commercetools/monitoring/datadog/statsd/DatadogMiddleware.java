
package com.commercetools.monitoring.datadog.statsd;

import static com.commercetools.monitoring.datadog.DatadogInfo.*;
import static java.lang.String.format;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.timgroup.statsd.StatsDClient;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.http.TelemetryMiddleware;

/**
 * This middleware uses API to submit metrics to datadog.
 * If you are using dogstatsd, use {@link com.commercetools.monitoring.datadog.DatadogMiddleware} to submit metrics to datadog with statsd.
 */
public class DatadogMiddleware implements TelemetryMiddleware {

    private final StatsDClient statsDClient;

    public DatadogMiddleware(final StatsDClient datadogStatsDClient) {
        this.statsDClient = datadogStatsDClient;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        final Instant start = Instant.now();

        return next.apply(request).thenApply(response -> {
            final List<String> tags = new ArrayList<>(4);
            tags.add(format("%s:%s", HTTP_RESPONSE_STATUS_CODE, response.getStatusCode()));
            tags.add(format("%s:%s", HTTP_REQUEST_METHOD, request.getMethod().name()));
            tags.add(format("%s:%s", SERVER_ADDRESS, request.getUri().getHost()));
            if (request.getUri().getPort() > 0) {
                tags.add(format("%s:%s", SERVER_PORT, request.getUri().getPort()));
            }

            this.statsDClient.recordHistogramValue(PREFIX + "." + CLIENT_DURATION,
                Duration.between(start, Instant.now()).toMillis(), tags.toArray(new String[0]));

            this.statsDClient.incrementCounter(PREFIX + "." + CLIENT_REQUEST_TOTAL, tags.toArray(new String[0]));
            if (response.getStatusCode() >= 400) {
                this.statsDClient.incrementCounter(PREFIX + "." + CLIENT_REQUEST_ERROR, tags.toArray(new String[0]));
            }
            return response;
        });
    }

}
