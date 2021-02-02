
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
public final class ShoppingListChangeTextLineItemsOrderActionImpl
        implements ShoppingListChangeTextLineItemsOrderAction {

    private String action;

    private java.util.List<String> textLineItemOrder;

    @JsonCreator
    ShoppingListChangeTextLineItemsOrderActionImpl(
            @JsonProperty("textLineItemOrder") final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
        this.action = CHANGE_TEXT_LINE_ITEMS_ORDER;
    }

    public ShoppingListChangeTextLineItemsOrderActionImpl() {
        this.action = CHANGE_TEXT_LINE_ITEMS_ORDER;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<String> getTextLineItemOrder() {
        return this.textLineItemOrder;
    }

    public void setTextLineItemOrder(final String... textLineItemOrder) {
        this.textLineItemOrder = new ArrayList<>(Arrays.asList(textLineItemOrder));
    }

    public void setTextLineItemOrder(final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListChangeTextLineItemsOrderActionImpl that = (ShoppingListChangeTextLineItemsOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(textLineItemOrder,
            that.textLineItemOrder).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(textLineItemOrder).toHashCode();
    }

}
