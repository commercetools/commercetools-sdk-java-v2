
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelTrackingDataActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelTrackingDataAction orderSetParcelTrackingDataAction = OrderSetParcelTrackingDataAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelTrackingDataActionBuilder implements Builder<OrderSetParcelTrackingDataAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    /**
     *
     * @param parcelId value to be set
     * @return Builder
     */

    public OrderSetParcelTrackingDataActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public OrderSetParcelTrackingDataActionBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param trackingData value to be set
     * @return Builder
     */

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

    /**
     * builds OrderSetParcelTrackingDataAction with checking for non-null required values
     * @return OrderSetParcelTrackingDataAction
     */
    public OrderSetParcelTrackingDataAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelTrackingDataAction.class + ": parcelId is missing");
        return new OrderSetParcelTrackingDataActionImpl(parcelId, trackingData);
    }

    /**
     * builds OrderSetParcelTrackingDataAction without checking for non-null required values
     * @return OrderSetParcelTrackingDataAction
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
