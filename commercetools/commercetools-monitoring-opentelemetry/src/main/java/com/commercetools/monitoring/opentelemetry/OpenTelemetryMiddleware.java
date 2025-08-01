
package com.commercetools.monitoring.opentelemetry;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongHistogram;
import io.opentelemetry.api.metrics.Meter;
import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.http.TelemetryMiddleware;

/**
 * <p>The OpenTelemetry middleware can be used to report metrics about outgoing request to commercetools.
 * It can be registered as TelemetryMiddleware to the {@link io.vrap.rmf.base.client.ClientBuilder#withTelemetryMiddleware(TelemetryMiddleware) ClientBuilder}
 * or the ApiRootBuilder.</p>
 *
 * {@include.example example.OpenTelemetryApiRootBuilderTest#addOpenTelemetry()}
 *
 * The middleware adds the following metrics:
 *  * <ul>
 *      <li>commercetools.client.duration: The duration of the request in milliseconds</li>
 *      <li>commercetools.client.total_requests: The total number of requests</li>
 *      <li>commercetools.client.error_requests: The total number of requests with a status code greater or equal to 400</li>
 * *  </ul>
 *
 * The metrics are enriched with the response status code, server address, port and request method.</p>
 *
 * <p>See also the <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/examples/spring-otel">Spring MVC example application</a> in the examples folder for further details.</p>
 */
public class OpenTelemetryMiddleware implements TelemetryMiddleware {
    private final LongHistogram histogram;
    private final LongCounter errorCounter;
    private final LongCounter requestCounter;

    private final Attributes attributes;

    public OpenTelemetryMiddleware(final OpenTelemetry otel) {
        this(otel, true, OpenTelemetryInfo.PREFIX);
    }

    public OpenTelemetryMiddleware(final OpenTelemetry otel, final boolean enableHistogram) {
        this(otel, enableHistogram, OpenTelemetryInfo.PREFIX);
    }

    public OpenTelemetryMiddleware(final OpenTelemetry otel, final boolean enableHistogram, final String prefix) {
        this(otel, enableHistogram, prefix, Collections.emptyMap());
    }

    public OpenTelemetryMiddleware(final OpenTelemetry otel, final boolean enableHistogram, final String prefix,
            final Map<String, String> attributes) {
        AttributesBuilder attrBuilder = Attributes.builder();
        attributes.forEach(attrBuilder::put);
        this.attributes = attrBuilder.build();

        Meter meter = otel.meterBuilder(OpenTelemetryResponseSerializer.class.getPackage().getName()).build();
        if (enableHistogram) {
            histogram = meter.histogramBuilder(prefix + "." + OpenTelemetryInfo.CLIENT_DURATION)
                    .ofLongs()
                    .setUnit(OpenTelemetryInfo.UNIT_MS)
                    .build();
        }
        else {
            histogram = null;
        }
        errorCounter = meter.counterBuilder(prefix + "." + OpenTelemetryInfo.CLIENT_REQUEST_ERROR).build();
        requestCounter = meter.counterBuilder(prefix + "." + OpenTelemetryInfo.CLIENT_REQUEST_TOTAL).build();
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        Instant start = Instant.now();
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
            AttributesBuilder builder = this.attributes.toBuilder()
                    .put(OpenTelemetryInfo.HTTP_RESPONSE_STATUS_CODE, statusCode)
                    .put(OpenTelemetryInfo.HTTP_REQUEST_METHOD, request.getMethod().name())
                    .put(OpenTelemetryInfo.SERVER_ADDRESS, request.getUri().getHost());
            if (request.getUri().getPort() > 0) {
                builder.put(OpenTelemetryInfo.SERVER_PORT, request.getUri().getPort());
            }
            Attributes attributes = builder.build();
            Optional.ofNullable(histogram)
                    .ifPresent(h -> h.record(Duration.between(start, Instant.now()).toMillis(), attributes));
            requestCounter.add(1, attributes);
            if (statusCode >= 400 || throwable != null) {
                errorCounter.add(1, attributes);
            }
            return response;
        });
    }
}
