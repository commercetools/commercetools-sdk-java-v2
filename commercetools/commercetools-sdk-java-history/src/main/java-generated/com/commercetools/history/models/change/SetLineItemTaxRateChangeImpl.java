
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
public final class SetLineItemTaxRateChangeImpl implements SetLineItemTaxRateChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxRate nextValue;

    private com.commercetools.history.models.common.TaxRate previousValue;

    @JsonCreator
    SetLineItemTaxRateChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("variant") final String variant,
            @JsonProperty("taxMode") final com.commercetools.history.models.common.TaxMode taxMode,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.TaxRate nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.TaxRate previousValue) {
        this.change = change;
        this.lineItem = lineItem;
        this.variant = variant;
        this.taxMode = taxMode;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_LINE_ITEM_TAX_RATE_CHANGE;
    }

    public SetLineItemTaxRateChangeImpl() {
        this.type = SET_LINE_ITEM_TAX_RATE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setLineItemTaxRate</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    public com.commercetools.history.models.common.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setTaxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setNextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLineItemTaxRateChangeImpl that = (SetLineItemTaxRateChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(variant, that.variant)
                .append(taxMode, that.taxMode)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(lineItem)
                .append(variant)
                .append(taxMode)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
