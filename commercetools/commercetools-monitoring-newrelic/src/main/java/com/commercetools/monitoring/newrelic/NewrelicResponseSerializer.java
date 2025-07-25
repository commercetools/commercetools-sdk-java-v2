
package com.commercetools.monitoring.newrelic;

import static com.commercetools.monitoring.newrelic.NewrelicInfo.*;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.newrelic.api.agent.NewRelic;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

/**
 * This serializer uses API to submit metrics to newrelic.
 */
public class NewrelicResponseSerializer implements ResponseSerializer {
    private final ResponseSerializer serializer;
    private final Map<String, Object> attributes;

    public NewrelicResponseSerializer(final ResponseSerializer serializer) {
        this.serializer = serializer;
        this.attributes = Collections.emptyMap();
    }

    public NewrelicResponseSerializer(final ResponseSerializer serializer, final Map<String, String> attributes) {
        this.serializer = serializer;
        this.attributes = Collections.unmodifiableMap(attributes);
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        NewRelic.addCustomParameters(this.attributes);
        NewRelic.recordMetric(PREFIX + JSON_DESERIALIZATION, (float) durationInMillis);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, JavaType outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        NewRelic.addCustomParameters(this.attributes);
        NewRelic.recordMetric(PREFIX + JSON_DESERIALIZATION, (float) durationInMillis);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, TypeReference<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        NewRelic.addCustomParameters(this.attributes);
        NewRelic.recordMetric(PREFIX + JSON_DESERIALIZATION, (float) durationInMillis);
        return result;
    }

    @Override
    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        Instant start = Instant.now();
        byte[] result = serializer.toJsonByteArray(value);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        NewRelic.addCustomParameters(this.attributes);
        NewRelic.recordMetric(PREFIX + JSON_SERIALIZATION, (float) durationInMillis);
        return result;
    }

}
