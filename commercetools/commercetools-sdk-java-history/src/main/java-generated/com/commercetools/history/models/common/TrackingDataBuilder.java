
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TrackingDataBuilder implements Builder<TrackingData> {

    private String trackingId;

    private String carrier;

    private String provider;

    private String providerTransaction;

    private Boolean isReturn;

    public TrackingDataBuilder trackingId(final String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    public TrackingDataBuilder carrier(final String carrier) {
        this.carrier = carrier;
        return this;
    }

    public TrackingDataBuilder provider(final String provider) {
        this.provider = provider;
        return this;
    }

    public TrackingDataBuilder providerTransaction(final String providerTransaction) {
        this.providerTransaction = providerTransaction;
        return this;
    }

    public TrackingDataBuilder isReturn(final Boolean isReturn) {
        this.isReturn = isReturn;
        return this;
    }

    public String getTrackingId() {
        return this.trackingId;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getProviderTransaction() {
        return this.providerTransaction;
    }

    public Boolean getIsReturn() {
        return this.isReturn;
    }

    public TrackingData build() {
        Objects.requireNonNull(trackingId, TrackingData.class + ": trackingId is missing");
        Objects.requireNonNull(carrier, TrackingData.class + ": carrier is missing");
        Objects.requireNonNull(provider, TrackingData.class + ": provider is missing");
        Objects.requireNonNull(providerTransaction, TrackingData.class + ": providerTransaction is missing");
        Objects.requireNonNull(isReturn, TrackingData.class + ": isReturn is missing");
        return new TrackingDataImpl(trackingId, carrier, provider, providerTransaction, isReturn);
    }

    /**
     * builds TrackingData without checking for non null required values
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
