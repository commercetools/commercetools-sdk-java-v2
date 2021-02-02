
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeCustomLineItemQuantityActionImpl
        implements StagedOrderChangeCustomLineItemQuantityAction {

    private String action;

    private String customLineItemId;

    private Double quantity;

    @JsonCreator
    StagedOrderChangeCustomLineItemQuantityActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("quantity") final Double quantity) {
        this.customLineItemId = customLineItemId;
        this.quantity = quantity;
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    public StagedOrderChangeCustomLineItemQuantityActionImpl() {
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setQuantity(final Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderChangeCustomLineItemQuantityActionImpl that = (StagedOrderChangeCustomLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customLineItemId, that.customLineItemId).append(
            quantity, that.quantity).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(quantity).toHashCode();
    }

}
