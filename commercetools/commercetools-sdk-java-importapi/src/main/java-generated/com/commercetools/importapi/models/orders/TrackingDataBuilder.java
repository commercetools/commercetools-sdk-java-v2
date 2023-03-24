
package com.commercetools.importapi.models.orders;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TrackingDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TrackingData trackingData = TrackingData.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TrackingDataBuilder implements Builder<TrackingData> {

    @Nullable
    private String trackingId;

    @Nullable
    private String carrier;

    @Nullable
    private String provider;

    @Nullable
    private String providerTransaction;

    @Nullable
    private Boolean isReturn;

    /**
     *
     * @param trackingId value to be set
     * @return Builder
     */

    public TrackingDataBuilder trackingId(@Nullable final String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     *
     * @param carrier value to be set
     * @return Builder
     */

    public TrackingDataBuilder carrier(@Nullable final String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     *
     * @param provider value to be set
     * @return Builder
     */

    public TrackingDataBuilder provider(@Nullable final String provider) {
        this.provider = provider;
        return this;
    }

    /**
     *
     * @param providerTransaction value to be set
     * @return Builder
     */

    public TrackingDataBuilder providerTransaction(@Nullable final String providerTransaction) {
        this.providerTransaction = providerTransaction;
        return this;
    }

    /**
     *
     * @param isReturn value to be set
     * @return Builder
     */

    public TrackingDataBuilder isReturn(@Nullable final Boolean isReturn) {
        this.isReturn = isReturn;
        return this;
    }

    @Nullable
    public String getTrackingId() {
        return this.trackingId;
    }

    @Nullable
    public String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public String getProvider() {
        return this.provider;
    }

    @Nullable
    public String getProviderTransaction() {
        return this.providerTransaction;
    }

    @Nullable
    public Boolean getIsReturn() {
        return this.isReturn;
    }

    /**
     * builds TrackingData with checking for non-null required values
     * @return TrackingData
     */
    public TrackingData build() {
        return new TrackingDataImpl(trackingId, carrier, provider, providerTransaction, isReturn);
    }

    /**
     * builds TrackingData without checking for non-null required values
     * @return TrackingData
     */
    public TrackingData buildUnchecked() {
        return new TrackingDataImpl(trackingId, carrier, provider, providerTransaction, isReturn);
    }

    public static TrackingDataBuilder of() {
        return new TrackingDataBuilder();
    }

    public static TrackingDataBuilder of(final TrackingData template) {
        TrackingDataBuilder builder = new TrackingDataBuilder();
        builder.trackingId = template.getTrackingId();
        builder.carrier = template.getCarrier();
        builder.provider = template.getProvider();
        builder.providerTransaction = template.getProviderTransaction();
        builder.isReturn = template.getIsReturn();
        return builder;
    }

}
