
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelTrackingDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelTrackingData parcelTrackingData = ParcelTrackingData.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelTrackingDataBuilder implements Builder<ParcelTrackingData> {

    private String parcelId;

    @Nullable
    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    /**
     *
     * @param parcelId value to be set
     * @return Builder
     */

    public ParcelTrackingDataBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public ParcelTrackingDataBuilder trackingData(
            Function<com.commercetools.importapi.models.orders.TrackingDataBuilder, com.commercetools.importapi.models.orders.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.importapi.models.orders.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param trackingData value to be set
     * @return Builder
     */

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

    /**
     * builds ParcelTrackingData with checking for non-null required values
     * @return ParcelTrackingData
     */
    public ParcelTrackingData build() {
        Objects.requireNonNull(parcelId, ParcelTrackingData.class + ": parcelId is missing");
        return new ParcelTrackingDataImpl(parcelId, trackingData);
    }

    /**
     * builds ParcelTrackingData without checking for non-null required values
     * @return ParcelTrackingData
     */
    public ParcelTrackingData buildUnchecked() {
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
