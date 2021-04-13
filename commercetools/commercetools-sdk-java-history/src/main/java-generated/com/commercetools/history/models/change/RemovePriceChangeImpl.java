
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
public final class RemovePriceChangeImpl implements RemovePriceChange {

    private String type;

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    @JsonCreator
    RemovePriceChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("catalogData") final String catalogData, @JsonProperty("priceId") final String priceId,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Price previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Price nextValue) {
        this.change = change;
        this.catalogData = catalogData;
        this.priceId = priceId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = REMOVE_PRICE_CHANGE;
    }

    public RemovePriceChangeImpl() {
        this.type = REMOVE_PRICE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for removing prices</p>
    */
    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public com.commercetools.history.models.common.Price getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemovePriceChangeImpl that = (RemovePriceChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(catalogData, that.catalogData)
                .append(priceId, that.priceId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(catalogData)
                .append(priceId)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
