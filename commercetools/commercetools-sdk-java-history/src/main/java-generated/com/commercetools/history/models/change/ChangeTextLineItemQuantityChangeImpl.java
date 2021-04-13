
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
public final class ChangeTextLineItemQuantityChangeImpl implements ChangeTextLineItemQuantityChange {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private Integer previousValue;

    private Integer nextValue;

    @JsonCreator
    ChangeTextLineItemQuantityChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("textLineItem") final com.commercetools.history.models.change_value.TextLineItemValue textLineItem,
            @JsonProperty("previousValue") final Integer previousValue,
            @JsonProperty("nextValue") final Integer nextValue) {
        this.change = change;
        this.textLineItem = textLineItem;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE;
    }

    public ChangeTextLineItemQuantityChangeImpl() {
        this.type = CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setTextLineItem(final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
    }

    public void setPreviousValue(final Integer previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final Integer nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTextLineItemQuantityChangeImpl that = (ChangeTextLineItemQuantityChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(textLineItem, that.textLineItem)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(textLineItem)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
