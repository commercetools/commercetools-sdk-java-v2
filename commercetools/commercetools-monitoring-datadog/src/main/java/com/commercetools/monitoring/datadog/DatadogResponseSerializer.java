
package com.commercetools.monitoring.datadog;

import static com.commercetools.monitoring.datadog.DatadogUtils.submitJsonDeserializationMetric;
import static com.commercetools.monitoring.datadog.DatadogUtils.submitJsonSerializationMetric;

import java.time.Duration;
import java.time.Instant;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MetricsApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

public class DatadogResponseSerializer implements ResponseSerializer {
    private final ResponseSerializer serializer;

    private final MetricsApi apiInstance;

    public DatadogResponseSerializer(final ResponseSerializer serializer, ApiClient ddApiClient) {
        this.serializer = serializer;
        this.apiInstance = new MetricsApi(ddApiClient);
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        submitJsonSerializationMetric(apiInstance, (double) durationInMillis, outputType.getCanonicalName());
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, JavaType outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        submitJsonSerializationMetric(apiInstance, (double) durationInMillis, outputType.toString());
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, TypeReference<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        submitJsonSerializationMetric(apiInstance, (double) durationInMillis, outputType.getType().getTypeName());
        return result;
    }

    @Override
    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        Instant start = Instant.now();
        byte[] result = serializer.toJsonByteArray(value);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        submitJsonDeserializationMetric(apiInstance, (double) durationInMillis, value.getClass().getCanonicalName());
        return result;
    }

}
