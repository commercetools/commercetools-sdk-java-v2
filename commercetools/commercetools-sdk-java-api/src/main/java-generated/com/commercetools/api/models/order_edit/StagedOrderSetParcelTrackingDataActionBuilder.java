
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetParcelTrackingDataActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelTrackingDataAction stagedOrderSetParcelTrackingDataAction = StagedOrderSetParcelTrackingDataAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelTrackingDataActionBuilder implements Builder<StagedOrderSetParcelTrackingDataAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.TrackingData trackingData;

    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */

    public StagedOrderSetParcelTrackingDataActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     * set the value to the trackingData using the builder function
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public StagedOrderSetParcelTrackingDataActionBuilder trackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the trackingData using the builder function
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public StagedOrderSetParcelTrackingDataActionBuilder withTrackingData(
            Function<com.commercetools.api.models.order.TrackingDataBuilder, com.commercetools.api.models.order.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.api.models.order.TrackingDataBuilder.of());
        return this;
    }

    /**
     * set the value to the trackingData
     * @param trackingData value to be set
     * @return Builder
     */

    public StagedOrderSetParcelTrackingDataActionBuilder trackingData(
            @Nullable final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     * value of parcelId}
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     * value of trackingData}
     * @return trackingData
     */

    @Nullable
    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /**
     * builds StagedOrderSetParcelTrackingDataAction with checking for non-null required values
     * @return StagedOrderSetParcelTrackingDataAction
     */
    public StagedOrderSetParcelTrackingDataAction build() {
        Objects.requireNonNull(parcelId, StagedOrderSetParcelTrackingDataAction.class + ": parcelId is missing");
        return new StagedOrderSetParcelTrackingDataActionImpl(parcelId, trackingData);
    }

    /**
     * builds StagedOrderSetParcelTrackingDataAction without checking for non-null required values
     * @return StagedOrderSetParcelTrackingDataAction
     */
    public StagedOrderSetParcelTrackingDataAction buildUnchecked() {
        return new StagedOrderSetParcelTrackingDataActionImpl(parcelId, trackingData);
    }

    /**
     * factory method for an instance of StagedOrderSetParcelTrackingDataActionBuilder
     * @return builder
     */
    public static StagedOrderSetParcelTrackingDataActionBuilder of() {
        return new StagedOrderSetParcelTrackingDataActionBuilder();
    }

    /**
     * create builder for StagedOrderSetParcelTrackingDataAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelTrackingDataActionBuilder of(
            final StagedOrderSetParcelTrackingDataAction template) {
        StagedOrderSetParcelTrackingDataActionBuilder builder = new StagedOrderSetParcelTrackingDataActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.trackingData = template.getTrackingData();
        return builder;
    }

}
