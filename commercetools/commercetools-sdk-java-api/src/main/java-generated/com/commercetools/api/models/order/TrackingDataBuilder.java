
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TrackingDataBuilder {

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

    public TrackingDataBuilder trackingId(@Nullable final String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    public TrackingDataBuilder carrier(@Nullable final String carrier) {
        this.carrier = carrier;
        return this;
    }

    public TrackingDataBuilder provider(@Nullable final String provider) {
        this.provider = provider;
        return this;
    }

    public TrackingDataBuilder providerTransaction(@Nullable final String providerTransaction) {
        this.providerTransaction = providerTransaction;
        return this;
    }

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

    public TrackingData build() {
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
