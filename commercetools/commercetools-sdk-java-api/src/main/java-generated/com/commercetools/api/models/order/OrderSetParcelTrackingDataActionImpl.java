
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
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelTrackingDataUpdatedMessage" rel="nofollow">ParcelTrackingDataUpdated</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelTrackingDataActionImpl implements OrderSetParcelTrackingDataAction, ModelBase {

    private String action;

    private String parcelId;

    private String parcelKey;

    private com.commercetools.api.models.order.TrackingData trackingData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetParcelTrackingDataActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("parcelKey") final String parcelKey,
            @JsonProperty("trackingData") final com.commercetools.api.models.order.TrackingData trackingData) {
        this.parcelId = parcelId;
        this.parcelKey = parcelKey;
        this.trackingData = trackingData;
        this.action = SET_PARCEL_TRACKING_DATA;
    }

    /**
     * create empty instance
     */
    public OrderSetParcelTrackingDataActionImpl() {
        this.action = SET_PARCEL_TRACKING_DATA;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.order.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setParcelKey(final String parcelKey) {
        this.parcelKey = parcelKey;
    }

    public void setTrackingData(final com.commercetools.api.models.order.TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetParcelTrackingDataActionImpl that = (OrderSetParcelTrackingDataActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(trackingData, that.trackingData)
                .append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(trackingData, that.trackingData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(parcelId)
                .append(parcelKey)
                .append(trackingData)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("parcelId", parcelId)
                .append("parcelKey", parcelKey)
                .append("trackingData", trackingData)
                .build();
    }

    @Override
    public OrderSetParcelTrackingDataAction copyDeep() {
        return OrderSetParcelTrackingDataAction.deepCopy(this);
    }
}
