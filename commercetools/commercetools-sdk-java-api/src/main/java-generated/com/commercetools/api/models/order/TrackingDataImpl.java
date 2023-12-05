
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Information that helps track a Parcel.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TrackingDataImpl implements TrackingData, ModelBase {

    private String trackingId;

    private String carrier;

    private String provider;

    private String providerTransaction;

    private Boolean isReturn;

    /**
     * create instance with all properties
     */
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

    /**
     * create empty instance
     */
    public TrackingDataImpl() {
    }

    /**
     *  <p>Identifier to track the Parcel.</p>
     */

    public String getTrackingId() {
        return this.trackingId;
    }

    /**
     *  <p>Name of the carrier that delivers the Parcel.</p>
     */

    public String getCarrier() {
        return this.carrier;
    }

    /**
     *  <p>Name of the provider that serves as facade to several carriers.</p>
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     *  <p>Transaction identifier with the <code>provider</code>.</p>
     */

    public String getProviderTransaction() {
        return this.providerTransaction;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the Parcel is being returned.</li>
     *   <li>If <code>false</code>, the Parcel is being delivered to the customer.</li>
     *  </ul>
     */

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
                .append(trackingId, that.trackingId)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("trackingId", trackingId)
                .append("carrier", carrier)
                .append("provider", provider)
                .append("providerTransaction", providerTransaction)
                .append("isReturn", isReturn)
                .build();
    }

}
