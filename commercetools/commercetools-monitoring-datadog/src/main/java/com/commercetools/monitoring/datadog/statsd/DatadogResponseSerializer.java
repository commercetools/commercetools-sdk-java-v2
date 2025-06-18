
package com.commercetools.monitoring.datadog.statsd;

import static com.commercetools.monitoring.datadog.DatadogInfo.*;
import static java.lang.String.format;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.timgroup.statsd.StatsDClient;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

/**
 * This serializer uses dogstatsd library to submit metrics to datadog.
 * If you are not using statsd, use {@link com.commercetools.monitoring.datadog.DatadogResponseSerializer} to submit metrics to datadog with API.
 */
public class DatadogResponseSerializer implements ResponseSerializer {
    private final ResponseSerializer serializer;

    private final StatsDClient statsDClient;

    private final Collection<String> tags;

    public DatadogResponseSerializer(final ResponseSerializer serializer, final StatsDClient datadogStatsDClient) {
        this.serializer = serializer;
        this.statsDClient = datadogStatsDClient;
        this.tags = Collections.emptyList();
    }

    public DatadogResponseSerializer(final ResponseSerializer serializer, final StatsDClient datadogStatsDClient,
            final Map<String, String> tags) {
        this.serializer = serializer;
        this.statsDClient = datadogStatsDClient;
        this.tags = tags.entrySet()
                .stream()
                .map(entry -> format("%s:%s", entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        final Collection<String> tags = new ArrayList<>(this.tags);
        tags.add(format("%s:%s", RESPONSE_BODY_TYPE, outputType.getCanonicalName()));

        this.statsDClient.recordHistogramValue(PREFIX + "." + JSON_DESERIALIZATION, durationInMillis,
            tags.toArray(new String[0]));
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, JavaType outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        final Collection<String> tags = new ArrayList<>(this.tags);
        tags.add(format("%s:%s", RESPONSE_BODY_TYPE, outputType.toString()));

        this.statsDClient.recordHistogramValue(PREFIX + "." + JSON_DESERIALIZATION, durationInMillis,
            tags.toArray(new String[0]));
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, TypeReference<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        final Collection<String> tags = new ArrayList<>(this.tags);
        tags.add(format("%s:%s", RESPONSE_BODY_TYPE, outputType.getType().getTypeName()));

        this.statsDClient.recordHistogramValue(PREFIX + "." + JSON_DESERIALIZATION, durationInMillis,
            tags.toArray(new String[0]));
        return result;
    }

    @Override
    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        Instant start = Instant.now();
        byte[] result = serializer.toJsonByteArray(value);
        double durationInMillis = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        final Collection<String> tags = new ArrayList<>(this.tags);
        tags.add(format("%s:%s", RESPONSE_BODY_TYPE, value.getClass().getCanonicalName()));

        this.statsDClient.recordHistogramValue(PREFIX + "." + JSON_SERIALIZATION, durationInMillis,
            tags.toArray(new String[0]));
        return result;
    }

}
