
package com.commercetools.monitoring.dynatrace;

import static com.commercetools.monitoring.dynatrace.DynatraceInfo.*;
import static java.lang.String.format;

import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

import com.dynatrace.metric.util.MetricException;
import com.dynatrace.metric.util.MetricLineBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.HandlerStack;
import io.vrap.rmf.base.client.http.HttpHandler;

/**
 *  This serializer uses Dynatrace API to submit telemetry data.
 *  It can be registered as Serializer to the {@link io.vrap.rmf.base.client.ClientBuilder#withSerializer(ResponseSerializer) ClientBuilder}
 *  or the ApiRootBuilder.</p>
 *   {@include.example example.DynatraceApiRootBuilderTest#addDynatraceSerializer()}
 *   The middleware adds the following metrics to Dynatrace:
 *  <ul>
 *      <li>commercetools.client.duration: The duration of the request in milliseconds</li>
 *      <li>commercetools.client.total_requests: The total number of requests</li>
 *      <li>commercetools.client.error_requests: The total number of requests with a status code greater or equal to 400</li>
 *  </ul>
 *  <p>The metrics are enriched with the response status code, server address, port and request method.</p>
 *   <p>See also the <a href="https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/examples/spring-dynatrace">Spring MVC example application</a> in the examples folder for further details.</p>
 *
 */
public class DynatraceResponseSerializer implements ResponseSerializer {
    private final ResponseSerializer serializer;
    private final ApiHttpClient client;
    private final String apiToken;

    public DynatraceResponseSerializer(final ResponseSerializer serializer, final String baseDynatraceUrl,
            final String apiToken) {
        this.serializer = serializer;
        this.apiToken = apiToken;
        final VrapHttpClient httpClient = HttpClientSupplier.of(new ForkJoinPool()).get();
        this.client = new ApiHttpClientImpl(baseDynatraceUrl,
            HandlerStack.create(HttpHandler.create(httpClient), Collections.emptyList()));
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        // do sth
        try {
            Map<String, String> dimensions = new HashMap<>();
            dimensions.put(RESPONSE_BODY_TYPE, outputType.getCanonicalName());
            String jsonDeserializationMetric = createGaugeMetric(dimensions, JSON_SERIALIZATION, durationInMillis);
            executeCreateMetric(jsonDeserializationMetric).join();
        }
        catch (MetricException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, JavaType outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        // do sth
        try {
            Map<String, String> dimensions = new HashMap<>();
            dimensions.put(RESPONSE_BODY_TYPE, outputType.toString());
            String jsonDeserializationMetric = createGaugeMetric(dimensions, JSON_SERIALIZATION, durationInMillis);
            executeCreateMetric(jsonDeserializationMetric).join();
        }
        catch (MetricException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, TypeReference<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        // do sth
        try {
            Map<String, String> dimensions = new HashMap<>();
            dimensions.put(RESPONSE_BODY_TYPE, outputType.getType().getTypeName());
            String jsonDeserializationMetric = createGaugeMetric(dimensions, JSON_SERIALIZATION, durationInMillis);
            executeCreateMetric(jsonDeserializationMetric).join();
        }
        catch (MetricException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    @Override
    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        Instant start = Instant.now();
        byte[] result = serializer.toJsonByteArray(value);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        // do sth
        try {
            Map<String, String> dimensions = new HashMap<>();
            dimensions.put(REQUEST_BODY_TYPE, value.getClass().getCanonicalName());
            String jsonSerializationMetric = createGaugeMetric(dimensions, JSON_DESERIALIZATION, durationInMillis);
            executeCreateMetric(jsonSerializationMetric).join();
        }
        catch (MetricException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private String createGaugeMetric(final Map<String, String> dimensions, final String metricKey,
            final long durationInMillis) throws MetricException {
        return MetricLineBuilder.create()
                .metricKey(PREFIX + "." + metricKey)
                .dimensions(dimensions)
                .gauge()
                .value(durationInMillis)
                .build();
    }

    private CompletableFuture<ApiHttpResponse<byte[]>> executeCreateMetric(final String metric) {
        return this.client.execute(new ApiHttpRequest(ApiHttpMethod.POST, URI.create(DYNATRACE_METRICS_API_PATH),
            new ApiHttpHeaders().addHeader("Authorization", format("Api-Token %s", this.apiToken))
                    .addHeader("Content-Type", "text/plain"),
            metric.getBytes()));
    }

}
