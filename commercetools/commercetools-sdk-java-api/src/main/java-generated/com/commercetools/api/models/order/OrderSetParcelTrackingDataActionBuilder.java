
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetParcelTrackingDataActionBuilder implements Builder<OrderSetParcelTrackingDataAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    public OrderSetParcelTrackingDataActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public OrderSetParcelTrackingDataActionBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    public OrderSetParcelTrackingDataActionBuilder trackingData(
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

    public OrderSetParcelTrackingDataAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelTrackingDataAction.class + ": parcelId is missing");
        return new OrderSetParcelTrackingDataActionImpl(parcelId, trackingData);
    }

    /**
     * builds OrderSetParcelTrackingDataAction without checking for non null required values
     */
    public OrderSetParcelTrackingDataAction buildUnchecked() {
        return new OrderSetParcelTrackingDataActionImpl(parcelId, trackingData);
    }

    public static OrderSetParcelTrackingDataActionBuilder of() {
        return new OrderSetParcelTrackingDataActionBuilder();
    }

    public static OrderSetParcelTrackingDataActionBuilder of(final OrderSetParcelTrackingDataAction template) {
        OrderSetParcelTrackingDataActionBuilder builder = new OrderSetParcelTrackingDataActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.trackingData = template.getTrackingData();
        return builder;
    }

}
