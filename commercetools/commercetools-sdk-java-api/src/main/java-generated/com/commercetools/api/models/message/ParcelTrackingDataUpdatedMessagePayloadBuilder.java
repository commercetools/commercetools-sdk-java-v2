
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelTrackingDataUpdatedMessagePayloadBuilder {

    private String deliveryId;

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    public ParcelTrackingDataUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public ParcelTrackingDataUpdatedMessagePayloadBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public ParcelTrackingDataUpdatedMessagePayloadBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public ParcelTrackingDataUpdatedMessagePayload build() {
        return new ParcelTrackingDataUpdatedMessagePayloadImpl(deliveryId, parcelId, trackingData);
    }

    public static ParcelTrackingDataUpdatedMessagePayloadBuilder of() {
        return new ParcelTrackingDataUpdatedMessagePayloadBuilder();
    }

    public static ParcelTrackingDataUpdatedMessagePayloadBuilder of(
            final ParcelTrackingDataUpdatedMessagePayload template) {
        ParcelTrackingDataUpdatedMessagePayloadBuilder builder = new ParcelTrackingDataUpdatedMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.parcelId = template.getParcelId();
        builder.trackingData = template.getTrackingData();
        return builder;
    }

}
