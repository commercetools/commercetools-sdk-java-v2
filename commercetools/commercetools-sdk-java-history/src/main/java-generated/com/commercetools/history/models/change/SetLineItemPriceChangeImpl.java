
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
public final class SetLineItemPriceChangeImpl implements SetLineItemPriceChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private com.commercetools.history.models.common.Price nextValue;

    private com.commercetools.history.models.common.Price previousValue;

    @JsonCreator
    SetLineItemPriceChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Price nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Price previousValue) {
        this.change = change;
        this.lineItem = lineItem;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_LINE_ITEM_PRICE_CHANGE;
    }

    public SetLineItemPriceChangeImpl() {
        this.type = SET_LINE_ITEM_PRICE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setLineItemPrice</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Price getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setNextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLineItemPriceChangeImpl that = (SetLineItemPriceChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(lineItem)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
