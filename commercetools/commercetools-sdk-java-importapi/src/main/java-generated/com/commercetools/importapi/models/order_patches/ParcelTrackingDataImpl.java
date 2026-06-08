
package com.commercetools.importapi.models.order_patches;

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
 * ParcelTrackingData
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelTrackingDataImpl implements ParcelTrackingData, ModelBase {

    private String parcelId;

    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelTrackingDataImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("trackingData") final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.parcelId = parcelId;
        this.trackingData = trackingData;
    }

    /**
     * create empty instance
     */
    public ParcelTrackingDataImpl() {
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Information that helps track a Parcel.</p>
     */

    public com.commercetools.importapi.models.orders.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setTrackingData(final com.commercetools.importapi.models.orders.TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelTrackingDataImpl that = (ParcelTrackingDataImpl) o;

        return new EqualsBuilder().append(parcelId, that.parcelId)
                .append(trackingData, that.trackingData)
                .append(parcelId, that.parcelId)
                .append(trackingData, that.trackingData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(parcelId).append(trackingData).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("parcelId", parcelId)
                .append("trackingData", trackingData)
                .build();
    }

    @Override
    public ParcelTrackingData copyDeep() {
        return ParcelTrackingData.deepCopy(this);
    }
}
