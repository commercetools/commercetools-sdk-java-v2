
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetParcelTrackingDataActionBuilder {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    public StagedOrderSetParcelTrackingDataActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public StagedOrderSetParcelTrackingDataActionBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public StagedOrderSetParcelTrackingDataAction build() {
        return new StagedOrderSetParcelTrackingDataActionImpl(parcelId, trackingData);
    }

    public static StagedOrderSetParcelTrackingDataActionBuilder of() {
        return new StagedOrderSetParcelTrackingDataActionBuilder();
    }

    public static StagedOrderSetParcelTrackingDataActionBuilder of(
            final StagedOrderSetParcelTrackingDataAction template) {
        StagedOrderSetParcelTrackingDataActionBuilder builder = new StagedOrderSetParcelTrackingDataActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.trackingData = template.getTrackingData();
        return builder;
    }

}
