
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingMethodTaxAmountChangeImpl implements SetShippingMethodTaxAmountChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    @JsonCreator
    SetShippingMethodTaxAmountChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("taxMode") final com.commercetools.history.models.common.TaxMode taxMode,
            @JsonProperty("nextValue") final java.lang.Object nextValue,
            @JsonProperty("previousValue") final java.lang.Object previousValue) {
        this.change = change;
        this.taxMode = taxMode;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_SHIPPING_METHOD_TAX_AMOUNT_CHANGE;
    }

    public SetShippingMethodTaxAmountChangeImpl() {
        this.type = SET_SHIPPING_METHOD_TAX_AMOUNT_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setShippingMethodTaxAmount</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
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

    public void setTaxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
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

        SetShippingMethodTaxAmountChangeImpl that = (SetShippingMethodTaxAmountChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(taxMode, that.taxMode)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(taxMode)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
