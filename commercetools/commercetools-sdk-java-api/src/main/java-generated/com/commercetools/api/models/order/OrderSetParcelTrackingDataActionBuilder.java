
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelTrackingDataActionBuilder implements Builder<OrderSetParcelTrackingDataAction> {

    @Nullable
    private String parcelId;

    @Nullable
    private String parcelKey;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public OrderSetParcelTrackingDataActionBuilder parcelId(@Nullable final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     * @return Builder
     */

    public OrderSetParcelTrackingDataActionBuilder parcelKey(@Nullable final String parcelKey) {
        this.parcelKey = parcelKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public OrderSetParcelTrackingDataActionBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public OrderSetParcelTrackingDataActionBuilder withTrackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param trackingData value to be set
     * @return Builder
     */

    public OrderSetParcelTrackingDataActionBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @Nullable
    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @Nullable
    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return trackingData
     */

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     * builds OrderSetParcelTrackingDataAction with checking for non-null required values
     * @return OrderSetParcelTrackingDataAction
     */
    public OrderSetParcelTrackingDataAction build() {
        return new OrderSetParcelTrackingDataActionImpl(parcelId, parcelKey, trackingData);
    }

    /**
     * builds OrderSetParcelTrackingDataAction without checking for non-null required values
     * @return OrderSetParcelTrackingDataAction
     */
    public OrderSetParcelTrackingDataAction buildUnchecked() {
        return new OrderSetParcelTrackingDataActionImpl(parcelId, parcelKey, trackingData);
    }

    /**
     * factory method for an instance of OrderSetParcelTrackingDataActionBuilder
     * @return builder
     */
    public static OrderSetParcelTrackingDataActionBuilder of() {
        return new OrderSetParcelTrackingDataActionBuilder();
    }

    /**
     * create builder for OrderSetParcelTrackingDataAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelTrackingDataActionBuilder of(final OrderSetParcelTrackingDataAction template) {
        OrderSetParcelTrackingDataActionBuilder builder = new OrderSetParcelTrackingDataActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.parcelKey = template.getParcelKey();
        builder.trackingData = template.getTrackingData();
        return builder;
    }

}
