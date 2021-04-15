
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelAddedToDeliveryMessagePayloadBuilder {

    private com.commercetools.api.models.order.Delivery delivery;

    private com.commercetools.api.models.order.Parcel parcel;

    public ParcelAddedToDeliveryMessagePayloadBuilder delivery(
            final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
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
