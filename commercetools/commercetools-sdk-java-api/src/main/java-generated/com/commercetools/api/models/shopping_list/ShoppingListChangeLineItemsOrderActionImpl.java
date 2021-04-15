
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListChangeLineItemsOrderActionImpl implements ShoppingListChangeLineItemsOrderAction {

    private String action;

    private java.util.List<String> lineItemOrder;

    @JsonCreator
    ShoppingListChangeLineItemsOrderActionImpl(
            @JsonProperty("lineItemOrder") final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        this.action = CHANGE_LINE_ITEMS_ORDER;
    }

    public ShoppingListChangeLineItemsOrderActionImpl() {
        this.action = CHANGE_LINE_ITEMS_ORDER;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<String> getLineItemOrder() {
        return this.lineItemOrder;
    }

    public void setLineItemOrder(final String... lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
    }

    public void setLineItemOrder(final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListChangeLineItemsOrderActionImpl that = (ShoppingListChangeLineItemsOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(lineItemOrder, that.lineItemOrder).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemOrder).toHashCode();
    }

}
