
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TrackingDataImpl implements TrackingData {

    private String trackingId;

    private String carrier;

    private String provider;

    private String providerTransaction;

    private Boolean isReturn;

    @JsonCreator
    TrackingDataImpl(@JsonProperty("trackingId") final String trackingId, @JsonProperty("carrier") final String carrier,
            @JsonProperty("provider") final String provider,
            @JsonProperty("providerTransaction") final String providerTransaction,
            @JsonProperty("isReturn") final Boolean isReturn) {
        this.trackingId = trackingId;
        this.carrier = carrier;
        this.provider = provider;
        this.providerTransaction = providerTransaction;
        this.isReturn = isReturn;
    }

    public TrackingDataImpl() {
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

    public void setTrackingId(final String trackingId) {
        this.trackingId = trackingId;
    }

    public void setCarrier(final String carrier) {
        this.carrier = carrier;
    }

    public void setProvider(final String provider) {
        this.provider = provider;
    }

    public void setProviderTransaction(final String providerTransaction) {
        this.providerTransaction = providerTransaction;
    }

    public void setIsReturn(final Boolean isReturn) {
        this.isReturn = isReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TrackingDataImpl that = (TrackingDataImpl) o;

        return new EqualsBuilder().append(trackingId, that.trackingId)
                .append(carrier, that.carrier)
                .append(provider, that.provider)
                .append(providerTransaction, that.providerTransaction)
                .append(isReturn, that.isReturn)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(trackingId)
                .append(carrier)
                .append(provider)
                .append(providerTransaction)
                .append(isReturn)
                .toHashCode();
    }

}
