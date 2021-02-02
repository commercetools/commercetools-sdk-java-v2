
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelRemovedFromDeliveryMessagePayloadBuilder {

    private String deliveryId;

    private com.commercetools.api.models.order.Parcel parcel;

    public ParcelRemovedFromDeliveryMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
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
