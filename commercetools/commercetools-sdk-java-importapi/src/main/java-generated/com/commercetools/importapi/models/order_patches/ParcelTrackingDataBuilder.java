
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
     *  <p><code>id</code> of an existing Parcel.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public ParcelTrackingDataBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>Information that helps track a Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public ParcelTrackingDataBuilder trackingData(
            Function<com.commercetools.importapi.models.orders.TrackingDataBuilder, com.commercetools.importapi.models.orders.TrackingDataBuilder> builder) {
        this.trackingData = builder.apply(com.commercetools.importapi.models.orders.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information that helps track a Parcel.</p>
     * @param builder function to build the trackingData value
     * @return Builder
     */

    public ParcelTrackingDataBuilder withTrackingData(
            Function<com.commercetools.importapi.models.orders.TrackingDataBuilder, com.commercetools.importapi.models.orders.TrackingData> builder) {
        this.trackingData = builder.apply(com.commercetools.importapi.models.orders.TrackingDataBuilder.of());
        return this;
    }

    /**
     *  <p>Information that helps track a Parcel.</p>
     * @param trackingData value to be set
     * @return Builder
     */

    public ParcelTrackingDataBuilder trackingData(
            @Nullable final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Information that helps track a Parcel.</p>
     * @return trackingData
     */

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

    /**
     * factory method for an instance of ParcelTrackingDataBuilder
     * @return builder
     */
    public static ParcelTrackingDataBuilder of() {
        return new ParcelTrackingDataBuilder();
    }

    /**
     * create builder for ParcelTrackingData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelTrackingDataBuilder of(final ParcelTrackingData template) {
        ParcelTrackingDataBuilder builder = new ParcelTrackingDataBuilder();
        builder.parcelId = template.getParcelId();
        builder.trackingData = template.getTrackingData();
        return builder;
    }

}
