
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
public final class SetLineItemShippingDetailsChangeImpl implements SetLineItemShippingDetailsChange {

    private String type;

    private String change;

    private String lineItemId;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    @JsonCreator
    SetLineItemShippingDetailsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ItemShippingDetails nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.change = change;
        this.lineItemId = lineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
    }

    public SetLineItemShippingDetailsChangeImpl() {
        this.type = SET_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setLineItemShippingDetails</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public com.commercetools.history.models.common.ItemShippingDetails getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.ItemShippingDetails getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setNextValue(final com.commercetools.history.models.common.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLineItemShippingDetailsChangeImpl that = (SetLineItemShippingDetailsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(lineItemId, that.lineItemId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(lineItemId)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
