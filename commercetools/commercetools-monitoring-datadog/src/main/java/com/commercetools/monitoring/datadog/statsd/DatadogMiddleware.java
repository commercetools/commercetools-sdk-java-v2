
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

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.http.TelemetryMiddleware;

/**
 * <p>The DatadogTelemetry middleware can be used to report outgoing request to commercetools to Datadog.
 * This middleware uses Datadog StatsD protocol to submit telemetry data.
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
 * <p>See also the <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/examples/spring-datadog-statsd">Spring MVC example application</a> in the examples folder for further details.</p>
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

        return next.apply(request).handle((response, throwable) -> {
            final List<String> tags = new ArrayList<>(4);
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
            tags.add(format("%s:%s", HTTP_RESPONSE_STATUS_CODE, statusCode));
            tags.add(format("%s:%s", HTTP_REQUEST_METHOD, request.getMethod().name()));
            tags.add(format("%s:%s", SERVER_ADDRESS, request.getUri().getHost()));
            if (request.getUri().getPort() > 0) {
                tags.add(format("%s:%s", SERVER_PORT, request.getUri().getPort()));
            }

            this.statsDClient.recordHistogramValue(PREFIX + "." + CLIENT_DURATION,
                Duration.between(start, Instant.now()).toMillis(), tags.toArray(new String[0]));

            this.statsDClient.incrementCounter(PREFIX + "." + CLIENT_REQUEST_TOTAL, tags.toArray(new String[0]));
            if (statusCode >= 400 || throwable != null) {
                this.statsDClient.incrementCounter(PREFIX + "." + CLIENT_REQUEST_ERROR, tags.toArray(new String[0]));
            }
            return response;
        });
    }

}
