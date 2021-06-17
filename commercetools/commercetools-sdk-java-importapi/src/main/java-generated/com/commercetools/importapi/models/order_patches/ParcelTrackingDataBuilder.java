
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelTrackingDataBuilder {

    private String parcelId;

    @Nullable
    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    public ParcelTrackingDataBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public ParcelTrackingDataBuilder trackingData(
            @Nullable final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public ParcelTrackingData build() {
        return new ParcelTrackingDataImpl(parcelId, trackingData);
    }

    public static ParcelTrackingDataBuilder of() {
        return new ParcelTrackingDataBuilder();
    }

    public static ParcelTrackingDataBuilder of(final ParcelTrackingData template) {
        ParcelTrackingDataBuilder builder = new ParcelTrackingDataBuilder();
        builder.parcelId = template.getParcelId();
        builder.trackingData = template.getTrackingData();
        return builder;
    }

}
