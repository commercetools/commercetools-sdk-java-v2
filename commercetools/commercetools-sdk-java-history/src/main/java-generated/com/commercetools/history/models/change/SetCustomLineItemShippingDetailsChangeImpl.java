
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
public class SetCustomLineItemShippingDetailsChangeImpl implements SetCustomLineItemShippingDetailsChange, ModelBase {

    private String type;

    private String change;

    private String customLineItemId;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    @JsonCreator
    SetCustomLineItemShippingDetailsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ItemShippingDetails nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.change = change;
        this.customLineItemId = customLineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
    }

    public SetCustomLineItemShippingDetailsChangeImpl() {
        this.type = SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setCustomLineItemShippingDetails</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
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

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

        SetCustomLineItemShippingDetailsChangeImpl that = (SetCustomLineItemShippingDetailsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(customLineItemId, that.customLineItemId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(customLineItemId)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
