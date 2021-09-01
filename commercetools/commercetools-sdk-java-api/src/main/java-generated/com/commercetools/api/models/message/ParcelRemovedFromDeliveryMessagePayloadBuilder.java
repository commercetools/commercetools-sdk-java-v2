
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelRemovedFromDeliveryMessagePayloadBuilder
        implements Builder<ParcelRemovedFromDeliveryMessagePayload> {

    private String deliveryId;

    private com.commercetools.api.models.order.Parcel parcel;

    public ParcelRemovedFromDeliveryMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.ParcelBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of()).build();
        return this;
    }

    public ParcelRemovedFromDeliveryMessagePayloadBuilder parcel(
            final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    public ParcelRemovedFromDeliveryMessagePayload build() {
        Objects.requireNonNull(deliveryId, ParcelRemovedFromDeliveryMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(parcel, ParcelRemovedFromDeliveryMessagePayload.class + ": parcel is missing");
        return new ParcelRemovedFromDeliveryMessagePayloadImpl(deliveryId, parcel);
    }

    /**
     * builds ParcelRemovedFromDeliveryMessagePayload without checking for non null required values
     */
    public ParcelRemovedFromDeliveryMessagePayload buildUnchecked() {
        return new ParcelRemovedFromDeliveryMessagePayloadImpl(deliveryId, parcel);
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder of() {
        return new ParcelRemovedFromDeliveryMessagePayloadBuilder();
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder of(
            final ParcelRemovedFromDeliveryMessagePayload template) {
        ParcelRemovedFromDeliveryMessagePayloadBuilder builder = new ParcelRemovedFromDeliveryMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.parcel = template.getParcel();
        return builder;
    }

}
