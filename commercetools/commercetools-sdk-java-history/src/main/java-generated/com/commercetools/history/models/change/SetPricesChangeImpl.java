
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
public final class SetPricesChangeImpl implements SetPricesChange {

    private String type;

    private String change;

    private String catalogData;

    private String variant;

    private java.util.List<com.commercetools.history.models.common.Price> previousValue;

    private java.util.List<com.commercetools.history.models.common.Price> nextValue;

    @JsonCreator
    SetPricesChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("catalogData") final String catalogData, @JsonProperty("variant") final String variant,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.Price> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.Price> nextValue) {
        this.change = change;
        this.catalogData = catalogData;
        this.variant = variant;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_PRICES_CHANGE;
    }

    public SetPricesChangeImpl() {
        this.type = SET_PRICES_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setPrices</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getVariant() {
        return this.variant;
    }

    public java.util.List<com.commercetools.history.models.common.Price> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.Price> getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Price... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(final java.util.List<com.commercetools.history.models.common.Price> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Price... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.Price> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetPricesChangeImpl that = (SetPricesChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(catalogData, that.catalogData)
                .append(variant, that.variant)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(catalogData)
                .append(variant)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
