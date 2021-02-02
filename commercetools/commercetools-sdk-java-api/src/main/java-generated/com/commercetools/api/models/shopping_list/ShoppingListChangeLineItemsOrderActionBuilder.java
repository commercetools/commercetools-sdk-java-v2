
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListChangeLineItemsOrderActionBuilder {

    private java.util.List<String> lineItemOrder;

    public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder(final String... lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
        return this;
    }

    public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder(final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        return this;
    }

    public java.util.List<String> getLineItemOrder() {
        return this.lineItemOrder;
    }

    public ShoppingListChangeLineItemsOrderAction build() {
        return new ShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    public static ShoppingListChangeLineItemsOrderActionBuilder of() {
        return new ShoppingListChangeLineItemsOrderActionBuilder();
    }

    public static ShoppingListChangeLineItemsOrderActionBuilder of(
            final ShoppingListChangeLineItemsOrderAction template) {
        ShoppingListChangeLineItemsOrderActionBuilder builder = new ShoppingListChangeLineItemsOrderActionBuilder();
        builder.lineItemOrder = template.getLineItemOrder();
        return builder;
    }

}
