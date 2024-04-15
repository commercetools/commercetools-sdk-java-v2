
package com.commercetools.monitoring.dynatrace;

import static com.commercetools.monitoring.dynatrace.DynatraceInfo.*;
import static java.lang.String.format;

import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;

import com.dynatrace.metric.util.MetricException;
import com.dynatrace.metric.util.MetricLineBuilder;
import com.dynatrace.metric.util.MetricLinePreConfiguration;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.HandlerStack;
import io.vrap.rmf.base.client.http.HttpHandler;
import io.vrap.rmf.base.client.http.TelemetryMiddleware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>The DynatraceTelemetry middleware can be used to report outgoing request to commercetools to Dynatrace.
 * This middleware uses Dynatrace API to submit telemetry data.
 * It can be registered as TelemetryMiddleware to the {@link io.vrap.rmf.base.client.ClientBuilder#withTelemetryMiddleware(TelemetryMiddleware) ClientBuilder}
 * or the ApiRootBuilder.</p>
 *
 * {@include.example example.DynatraceApiRootBuilderTest#addDynatraceTelemetry()}
 *
 * The middleware adds the following metrics to Dynatrace:
 * <ul>
 *     <li>commercetools.client.duration: The duration of the request in milliseconds</li>
 *     <li>commercetools.client.total_requests: The total number of requests</li>
 *     <li>commercetools.client.error_requests: The total number of requests with a status code greater or equal to 400</li>
 * </ul>
 *
 * <p>See also the <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/examples/spring-dynatrace">Spring MVC example application</a> in the examples folder for further details.</p>
 */
public class DynatraceTelemetryMiddleware implements TelemetryMiddleware {

    private final ApiHttpClient client;
    private final String apiToken;

    private static final Logger logger = LoggerFactory.getLogger(DynatraceTelemetryMiddleware.class);

    public DynatraceTelemetryMiddleware(final String baseDynatraceUrl, final String apiToken) {
        this.apiToken = apiToken;
        final VrapHttpClient httpClient = HttpClientSupplier.of(new ForkJoinPool()).get();
        this.client = new ApiHttpClientImpl(baseDynatraceUrl,
            HandlerStack.create(HttpHandler.create(httpClient), Collections.emptyList()));
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {

        final Instant start = Instant.now();
        return next.apply(request).thenApply(response -> {
            // report to Dynatrace
            try {
                final List<CompletableFuture<ApiHttpResponse<byte[]>>> futures = new ArrayList<>(3);
                final MetricLinePreConfiguration metricLinePreConfiguration = createMetricLinePreConfiguration(request,
                    response);

                final String clientDurationMetric = createGaugeMetric(metricLinePreConfiguration, CLIENT_DURATION,
                    Duration.between(start, Instant.now()).toMillis());

                final String requestTotalMetric = createCountMetric(metricLinePreConfiguration, CLIENT_REQUEST_TOTAL);

                final CompletableFuture<ApiHttpResponse<byte[]>> clientDurationMetricFuture = executeCreateMetric(
                    clientDurationMetric);
                futures.add(clientDurationMetricFuture);
                final CompletableFuture<ApiHttpResponse<byte[]>> requestTotalMetricExecution = executeCreateMetric(
                    requestTotalMetric);
                futures.add(requestTotalMetricExecution);

                CompletableFuture<ApiHttpResponse<byte[]>> requestErrorMetricFuture;

                if (response.getStatusCode() >= 400) {
                    final String requestErrorMetric = createCountMetric(metricLinePreConfiguration,
                        CLIENT_REQUEST_ERROR);
                    requestErrorMetricFuture = executeCreateMetric(requestErrorMetric);
                    futures.add(requestErrorMetricFuture);
                }

                CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()])).join();
            }
            catch (MetricException e) {
                logger.warn("Failed to submit commercetools metrics to dynatrace", e);
            }

            return response;
        });
    }

    private CompletableFuture<ApiHttpResponse<byte[]>> executeCreateMetric(final String metric) {
        return this.client.execute(new ApiHttpRequest(ApiHttpMethod.POST, URI.create(DYNATRACE_METRICS_API_PATH),
            new ApiHttpHeaders().addHeader("Authorization", format("Api-Token %s", this.apiToken))
                    .addHeader("Content-Type", "text/plain"),
            metric.getBytes()));
    }

    private MetricLinePreConfiguration createMetricLinePreConfiguration(final ApiHttpRequest request,
            final ApiHttpResponse<byte[]> response) throws MetricException {
        final Map<String, String> dimensions = new HashMap<>();
        dimensions.put(HTTP_RESPONSE_STATUS_CODE, String.valueOf(response.getStatusCode()));
        dimensions.put(SERVER_ADDRESS, request.getUri().getHost());
        dimensions.put(HTTP_REQUEST_METHOD, request.getMethod().name());
        if (request.getUri().getPort() > 0) {
            dimensions.put(SERVER_PORT, String.valueOf(request.getUri().getPort()));
        }
        MetricLinePreConfiguration metricLinePreConfiguration = MetricLinePreConfiguration.builder()
                .defaultDimensions(dimensions)
                .dynatraceMetadataDimensions()
                .prefix(PREFIX)
                .build();
        return metricLinePreConfiguration;
    }

    private String createGaugeMetric(final MetricLinePreConfiguration metricLinePreConfiguration,
            final String metricName, final double value) throws MetricException {
        return MetricLineBuilder.create(metricLinePreConfiguration).metricKey(metricName).gauge().value(value).build();
    }

    private String createCountMetric(final MetricLinePreConfiguration metricLinePreConfiguration,
            final String metricName) throws MetricException {
        return MetricLineBuilder.create(metricLinePreConfiguration).metricKey(metricName).count().delta(1).build();
    }
}
