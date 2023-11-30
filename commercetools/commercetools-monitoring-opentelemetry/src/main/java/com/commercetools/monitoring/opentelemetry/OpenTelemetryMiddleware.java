
package com.commercetools.monitoring.opentelemetry;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongHistogram;
import io.opentelemetry.api.metrics.Meter;
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
 * <p>The middleware records a histogram about the request timing in milliseconds. The total number of responses and errors is counted.
 * The metrics are enriched with the response status code, server address, port and request method.</p>
 */
public class OpenTelemetryMiddleware implements TelemetryMiddleware {
    private final LongHistogram histogram;
    private final LongCounter errorCounter;
    private final LongCounter requestCounter;
    private final boolean enableHistogram;

    public OpenTelemetryMiddleware(final OpenTelemetry otel) {
        this(otel, true, OpenTelemetryInfo.PREFIX);
    }

    public OpenTelemetryMiddleware(final OpenTelemetry otel, final boolean enableHistogram) {
        this(otel, enableHistogram, OpenTelemetryInfo.PREFIX);
    }

    public OpenTelemetryMiddleware(final OpenTelemetry otel, final boolean enableHistogram, final String prefix) {
        Meter meter = otel.meterBuilder(OpenTelemetryResponseSerializer.class.getPackage().getName()).build();
        this.enableHistogram = enableHistogram;
        if (enableHistogram) {
            histogram = meter.histogramBuilder(prefix + "." + OpenTelemetryInfo.CLIENT_DURATION)
                    .ofLongs()
                    .setUnit(OpenTelemetryInfo.UNIT_MS)
                    .build();
        } else {
            histogram = null;
        }
        errorCounter = meter.counterBuilder(prefix + "." + OpenTelemetryInfo.CLIENT_REQUEST_ERROR).build();
        requestCounter = meter.counterBuilder(prefix + "." + OpenTelemetryInfo.CLIENT_REQUEST_TOTAL).build();
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        Instant start = Instant.now();
        return next.apply(request).thenApply(response -> {
            AttributesBuilder builder = Attributes.builder()
                    .put(OpenTelemetryInfo.HTTP_RESPONSE_STATUS_CODE, response.getStatusCode())
                    .put(OpenTelemetryInfo.HTTP_REQUEST_METHOD, request.getMethod().name())
                    .put(OpenTelemetryInfo.SERVER_ADDRESS, request.getUri().getHost());
            if (request.getUri().getPort() > 0) {
                builder.put(OpenTelemetryInfo.SERVER_PORT, request.getUri().getPort());
            }
            Attributes attributes = builder.build();
            if (enableHistogram) {
                histogram.record(Duration.between(start, Instant.now()).toMillis(), attributes);
            }
            requestCounter.add(1, attributes);
            if (response.getStatusCode() >= 400) {
                errorCounter.add(1, attributes);
            }
            return response;
        });
    }
}
