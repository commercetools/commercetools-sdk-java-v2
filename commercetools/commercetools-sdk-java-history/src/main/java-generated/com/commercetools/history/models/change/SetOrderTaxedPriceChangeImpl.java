
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
public final class SetOrderTaxedPriceChangeImpl implements SetOrderTaxedPriceChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxedItemPrice nextValue;

    private com.commercetools.history.models.common.TaxedItemPrice previousValue;

    @JsonCreator
    SetOrderTaxedPriceChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("taxMode") final com.commercetools.history.models.common.TaxMode taxMode,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.TaxedItemPrice nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.TaxedItemPrice previousValue) {
        this.change = change;
        this.taxMode = taxMode;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_ORDER_TAXED_PRICE_CHANGE;
    }

    public SetOrderTaxedPriceChangeImpl() {
        this.type = SET_ORDER_TAXED_PRICE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setOrderTaxedPrice</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setTaxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setNextValue(final com.commercetools.history.models.common.TaxedItemPrice nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.TaxedItemPrice previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetOrderTaxedPriceChangeImpl that = (SetOrderTaxedPriceChangeImpl) o;

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
