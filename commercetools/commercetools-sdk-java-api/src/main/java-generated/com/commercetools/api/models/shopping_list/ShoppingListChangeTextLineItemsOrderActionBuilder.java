
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListChangeTextLineItemsOrderActionBuilder
        implements Builder<ShoppingListChangeTextLineItemsOrderAction> {

    private java.util.List<String> textLineItemOrder;

    public ShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder(final String... textLineItemOrder) {
        this.textLineItemOrder = new ArrayList<>(Arrays.asList(textLineItemOrder));
        return this;
    }

    public ShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder(
            final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
        return this;
    }

    public java.util.List<String> getTextLineItemOrder() {
        return this.textLineItemOrder;
    }

    public ShoppingListChangeTextLineItemsOrderAction build() {
        Objects.requireNonNull(textLineItemOrder,
            ShoppingListChangeTextLineItemsOrderAction.class + ": textLineItemOrder is missing");
        return new ShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }

    /**
     * builds ShoppingListChangeTextLineItemsOrderAction without checking for non null required values
     */
    public ShoppingListChangeTextLineItemsOrderAction buildUnchecked() {
        return new ShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }

    public static ShoppingListChangeTextLineItemsOrderActionBuilder of() {
        return new ShoppingListChangeTextLineItemsOrderActionBuilder();
    }

    public static ShoppingListChangeTextLineItemsOrderActionBuilder of(
            final ShoppingListChangeTextLineItemsOrderAction template) {
        ShoppingListChangeTextLineItemsOrderActionBuilder builder = new ShoppingListChangeTextLineItemsOrderActionBuilder();
        builder.textLineItemOrder = template.getTextLineItemOrder();
        return builder;
    }

}
