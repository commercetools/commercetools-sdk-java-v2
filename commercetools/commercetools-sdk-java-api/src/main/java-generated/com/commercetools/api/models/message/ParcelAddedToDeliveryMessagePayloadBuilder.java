
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelAddedToDeliveryMessagePayloadBuilder implements Builder<ParcelAddedToDeliveryMessagePayload> {

    private com.commercetools.api.models.order.Delivery delivery;

    private com.commercetools.api.models.order.Parcel parcel;

    public ParcelAddedToDeliveryMessagePayloadBuilder delivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }

    public ParcelAddedToDeliveryMessagePayloadBuilder delivery(
            final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public ParcelAddedToDeliveryMessagePayloadBuilder parcel(
            Function<com.commercetools.api.models.order.ParcelBuilder, com.commercetools.api.models.order.ParcelBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.api.models.order.ParcelBuilder.of()).build();
        return this;
    }

    public ParcelAddedToDeliveryMessagePayloadBuilder parcel(final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
        return this;
    }

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    public ParcelAddedToDeliveryMessagePayload build() {
        Objects.requireNonNull(delivery, ParcelAddedToDeliveryMessagePayload.class + ": delivery is missing");
        Objects.requireNonNull(parcel, ParcelAddedToDeliveryMessagePayload.class + ": parcel is missing");
        return new ParcelAddedToDeliveryMessagePayloadImpl(delivery, parcel);
    }

    /**
     * builds ParcelAddedToDeliveryMessagePayload without checking for non null required values
     */
    public ParcelAddedToDeliveryMessagePayload buildUnchecked() {
        return new ParcelAddedToDeliveryMessagePayloadImpl(delivery, parcel);
    }

    public static ParcelAddedToDeliveryMessagePayloadBuilder of() {
        return new ParcelAddedToDeliveryMessagePayloadBuilder();
    }

    public static ParcelAddedToDeliveryMessagePayloadBuilder of(final ParcelAddedToDeliveryMessagePayload template) {
        ParcelAddedToDeliveryMessagePayloadBuilder builder = new ParcelAddedToDeliveryMessagePayloadBuilder();
        builder.delivery = template.getDelivery();
        builder.parcel = template.getParcel();
        return builder;
    }

}
