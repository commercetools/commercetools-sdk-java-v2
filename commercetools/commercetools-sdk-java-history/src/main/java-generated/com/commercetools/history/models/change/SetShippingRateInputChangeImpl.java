
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.commercetools.history.models.change_value.SetCartClassificationShippingRateInputValue;
import com.commercetools.history.models.change_value.SetCartScoreShippingRateInputValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingRateInputChangeImpl implements SetShippingRateInputChange {

    private String type;

    private String change;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    @JsonCreator
    SetShippingRateInputChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final java.lang.Object nextValue,
            @JsonProperty("previousValue") final java.lang.Object previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_SHIPPING_RATE_INPUT_CHANGE;
    }

    public SetShippingRateInputChangeImpl() {
        this.type = SET_SHIPPING_RATE_INPUT_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setShippingRateInput</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetShippingRateInputChangeImpl that = (SetShippingRateInputChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
