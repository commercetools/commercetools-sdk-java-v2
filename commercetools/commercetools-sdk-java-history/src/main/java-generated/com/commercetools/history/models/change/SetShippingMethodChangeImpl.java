
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SetShippingMethodChangeImpl implements SetShippingMethodChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue;

    @JsonCreator
    SetShippingMethodChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_SHIPPING_METHOD_CHANGE;
    }

    public SetShippingMethodChangeImpl() {
        this.type = SET_SHIPPING_METHOD_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setShippingMethod</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetShippingMethodChangeImpl that = (SetShippingMethodChangeImpl) o;

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
