
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.commercetools.history.models.change_value.SetCartClassificationShippingRateInputValue;
import com.commercetools.history.models.change_value.SetCartScoreShippingRateInputValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Change triggered by the Set Shipping Rate Input update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingRateInputChangeImpl implements SetShippingRateInputChange, ModelBase {

    private String type;

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetShippingRateInputChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("nextValue") final java.lang.Object nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_SHIPPING_RATE_INPUT_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetShippingRateInputChangeImpl() {
        this.type = SET_SHIPPING_RATE_INPUT_CHANGE;
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    @JsonIgnore
    public void setPreviousValue(final SetCartClassificationShippingRateInputValue previousValue) {
        this.previousValue = previousValue;
    }

    @JsonIgnore
    public void setPreviousValue(final SetCartScoreShippingRateInputValue previousValue) {
        this.previousValue = previousValue;
    }

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
    }

    @JsonIgnore
    public void setNextValue(final SetCartClassificationShippingRateInputValue nextValue) {
        this.nextValue = nextValue;
    }

    @JsonIgnore
    public void setNextValue(final SetCartScoreShippingRateInputValue nextValue) {
        this.nextValue = nextValue;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetShippingRateInputChangeImpl that = (SetShippingRateInputChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
