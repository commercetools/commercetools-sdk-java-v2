
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelMeasurementsUpdatedMessagePayloadBuilder
        implements Builder<ParcelMeasurementsUpdatedMessagePayload> {

    private String deliveryId;

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    public ParcelMeasurementsUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public ParcelMeasurementsUpdatedMessagePayloadBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public ParcelMeasurementsUpdatedMessagePayloadBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    public ParcelMeasurementsUpdatedMessagePayloadBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public ParcelMeasurementsUpdatedMessagePayload build() {
        Objects.requireNonNull(deliveryId, ParcelMeasurementsUpdatedMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(parcelId, ParcelMeasurementsUpdatedMessagePayload.class + ": parcelId is missing");
        return new ParcelMeasurementsUpdatedMessagePayloadImpl(deliveryId, parcelId, measurements);
    }

    /**
     * builds ParcelMeasurementsUpdatedMessagePayload without checking for non null required values
     */
    public ParcelMeasurementsUpdatedMessagePayload buildUnchecked() {
        return new ParcelMeasurementsUpdatedMessagePayloadImpl(deliveryId, parcelId, measurements);
    }

    public static ParcelMeasurementsUpdatedMessagePayloadBuilder of() {
        return new ParcelMeasurementsUpdatedMessagePayloadBuilder();
    }

    public static ParcelMeasurementsUpdatedMessagePayloadBuilder of(
            final ParcelMeasurementsUpdatedMessagePayload template) {
        ParcelMeasurementsUpdatedMessagePayloadBuilder builder = new ParcelMeasurementsUpdatedMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.parcelId = template.getParcelId();
        builder.measurements = template.getMeasurements();
        return builder;
    }

}
