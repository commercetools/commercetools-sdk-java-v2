
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Parcel Tracking Data on Orders.</li>
 *   <li>Set Parcel Tracking Data on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelTrackingDataChangeImpl implements SetParcelTrackingDataChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.TrackingData previousValue;

    private com.commercetools.history.models.common.TrackingData nextValue;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetParcelTrackingDataChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.TrackingData previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.TrackingData nextValue,
            @JsonProperty("parcel") final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.parcel = parcel;
        this.type = SET_PARCEL_TRACKING_DATA_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetParcelTrackingDataChangeImpl() {
        this.type = SET_PARCEL_TRACKING_DATA_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.TrackingData getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.TrackingData getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     */

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.TrackingData previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.TrackingData nextValue) {
        this.nextValue = nextValue;
    }

    public void setParcel(final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetParcelTrackingDataChangeImpl that = (SetParcelTrackingDataChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(parcel, that.parcel)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(parcel, that.parcel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(parcel)
                .toHashCode();
    }

}
