
package com.commercetools.monitoring.opentelemetry;

import java.time.Duration;
import java.time.Instant;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.Meter;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

/**
 * <p>The OpenTelemetry ResponseSerializer can be used to report metrics about the De-/Serialization performance.
 * It can be registered as a {@link ResponseSerializer} to the {@link io.vrap.rmf.base.client.ClientBuilder#withSerializer(ResponseSerializer)} ClientBuilder
 * or the ApiRootBuilder.</p>
 *
 * {@include.example example.OpenTelemetryApiRootBuilderTest#addSerializer()}
 *
 * <p>The response serializer records a histogram about the serialization and deserialization timing of JSON in milliseconds.
 * The metrics are enriched with the de-/serialized class name.</p>
 */
public class OpenTelemetryResponseSerializer implements ResponseSerializer {
    private final ResponseSerializer serializer;

    private final DoubleHistogram serializerHistogram;
    private final DoubleHistogram deserializerHistogram;

    public OpenTelemetryResponseSerializer(final ResponseSerializer serializer, final OpenTelemetry otel) {
        this(serializer, otel, OpenTelemetryInfo.PREFIX);
    }

    public OpenTelemetryResponseSerializer(final ResponseSerializer serializer, final OpenTelemetry otel,
            final String prefix) {
        this.serializer = serializer;
        Meter meter = otel.meterBuilder(OpenTelemetryResponseSerializer.class.getPackage().getName()).build();
        serializerHistogram = meter.histogramBuilder(prefix + "." + OpenTelemetryInfo.JSON_SERIALIZATION)
                .setUnit(OpenTelemetryInfo.UNIT_MS)
                .build();
        deserializerHistogram = meter.histogramBuilder(prefix + "." + OpenTelemetryInfo.JSON_DESERIALIZATION)
                .setUnit(OpenTelemetryInfo.UNIT_MS)
                .build();

    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, Class<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        Attributes attributes = Attributes.of(AttributeKey.stringKey(OpenTelemetryInfo.RESPONSE_BODY_TYPE),
            outputType.getCanonicalName());
        double durationMs = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        deserializerHistogram.record(durationMs, attributes);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, JavaType outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        Attributes attributes = Attributes.of(AttributeKey.stringKey(OpenTelemetryInfo.RESPONSE_BODY_TYPE),
            outputType.toString());
        double duration = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        deserializerHistogram.record(duration, attributes);
        return result;
    }

    @Override
    public <O> ApiHttpResponse<O> convertResponse(ApiHttpResponse<byte[]> response, TypeReference<O> outputType) {
        Instant start = Instant.now();
        ApiHttpResponse<O> result = serializer.convertResponse(response, outputType);
        Attributes attributes = Attributes.of(AttributeKey.stringKey(OpenTelemetryInfo.RESPONSE_BODY_TYPE),
            outputType.getType().getTypeName());
        double duration = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        deserializerHistogram.record(duration, attributes);
        return result;
    }

    @Override
    public byte[] toJsonByteArray(Object value) throws JsonProcessingException {
        Instant start = Instant.now();
        byte[] result = serializer.toJsonByteArray(value);
        Attributes attributes = Attributes.of(AttributeKey.stringKey(OpenTelemetryInfo.REQUEST_BODY_TYPE),
            value.getClass().getCanonicalName());
        double duration = Duration.between(start, Instant.now()).toNanos() / 1_000_000.0;
        serializerHistogram.record(duration, attributes);
        return result;

    }
}
