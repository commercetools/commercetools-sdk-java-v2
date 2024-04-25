
package com.commercetools.monitoring.newrelic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.newrelic.api.agent.NewRelic;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

import java.time.Duration;
import java.time.Instant;

import static com.commercetools.monitoring.newrelic.NewrelicInfo.*;

/**
 * This serializer uses API to submit metrics to newrelic.
 */
public class NewrelicResponseSerializer implements ResponseSerializer {
    private final ResponseSerializer serializer;

    public NewrelicResponseSerializer(final ResponseSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        NewRelic.recordResponseTimeMetric(PREFIX + JSON_SERIALIZATION, durationInMillis);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, JavaType outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        NewRelic.recordResponseTimeMetric(PREFIX + JSON_SERIALIZATION, durationInMillis);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, TypeReference<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        NewRelic.recordResponseTimeMetric(PREFIX + JSON_SERIALIZATION, durationInMillis);
        return result;
    }

    @Override
    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        Instant start = Instant.now();
        byte[] result = serializer.toJsonByteArray(value);
        long durationInMillis = Duration.between(start, Instant.now()).toMillis();
        NewRelic.recordResponseTimeMetric(PREFIX + JSON_DESERIALIZATION, durationInMillis);
        return result;
    }

}
