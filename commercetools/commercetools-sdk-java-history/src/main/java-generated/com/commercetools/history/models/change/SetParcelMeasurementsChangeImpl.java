
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>SetParcelMeasurements on Orders.</li>
 *   <li>SetParcelMeasurements on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelMeasurementsChangeImpl implements SetParcelMeasurementsChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ParcelMeasurements previousValue;

    private com.commercetools.history.models.common.ParcelMeasurements nextValue;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetParcelMeasurementsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ParcelMeasurements previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ParcelMeasurements nextValue,
            @JsonProperty("parcel") final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.parcel = parcel;
        this.type = SET_PARCEL_MEASUREMENTS_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetParcelMeasurementsChangeImpl() {
        this.type = SET_PARCEL_MEASUREMENTS_CHANGE;
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

    public com.commercetools.history.models.common.ParcelMeasurements getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.ParcelMeasurements getNextValue() {
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

    public void setPreviousValue(final com.commercetools.history.models.common.ParcelMeasurements previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ParcelMeasurements nextValue) {
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

        SetParcelMeasurementsChangeImpl that = (SetParcelMeasurementsChangeImpl) o;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("parcel", parcel)
                .build();
    }

    @Override
    public SetParcelMeasurementsChange copyDeep() {
        return SetParcelMeasurementsChange.deepCopy(this);
    }
}
