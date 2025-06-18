
package com.commercetools.monitoring.datadog;

import static com.commercetools.monitoring.datadog.DatadogUtils.submitJsonDeserializationMetric;
import static com.commercetools.monitoring.datadog.DatadogUtils.submitJsonSerializationMetric;
import static java.lang.String.format;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MetricsApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

/**
 * This serializer uses API to submit metrics to datadog.
 * If you are using dogstatsd, use {@link com.commercetools.monitoring.datadog.statsd.DatadogResponseSerializer} to submit metrics to datadog with statsd.
 */
public class DatadogResponseSerializer implements ResponseSerializer {
    private final ResponseSerializer serializer;

    private final MetricsApi apiInstance;

    private final Collection<String> tags;


    public DatadogResponseSerializer(final ResponseSerializer serializer, final MetricsApi apiInstance, final Map<String, String> tags) {
        this.serializer = serializer;
        this.apiInstance = apiInstance;
        this.tags = tags.entrySet().stream().map(entry -> format("%s:%s", entry.getKey(), entry.getValue())).collect(
                Collectors.toList());
    }

    public DatadogResponseSerializer(final ResponseSerializer serializer, final MetricsApi apiInstance) {
       this(serializer, apiInstance, Collections.emptyMap());
    }

    public DatadogResponseSerializer(final ResponseSerializer serializer, final ApiClient ddApiClient, final Map<String, String> tags) {
        this(serializer, new MetricsApi(ddApiClient), tags);
    }
    public DatadogResponseSerializer(final ResponseSerializer serializer, final ApiClient ddApiClient) {
        this(serializer, new MetricsApi(ddApiClient), Collections.emptyMap());
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        submitJsonDeserializationMetric(apiInstance, (double) durationInMillis, outputType.getCanonicalName(), tags);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, JavaType outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        submitJsonDeserializationMetric(apiInstance, durationInMillis, outputType.toString(), tags);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, TypeReference<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        submitJsonDeserializationMetric(apiInstance, durationInMillis, outputType.getType().getTypeName(), tags);
        return result;
    }

    @Override
    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        Instant start = Instant.now();
        byte[] result = serializer.toJsonByteArray(value);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        submitJsonSerializationMetric(apiInstance, durationInMillis, value.getClass().getCanonicalName(), tags);
        return result;
    }

}
