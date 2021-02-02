
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListChangeTextLineItemsOrderActionBuilder {

    private java.util.List<String> textLineItemOrder;

    public MyShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder(final String... textLineItemOrder) {
        this.textLineItemOrder = new ArrayList<>(Arrays.asList(textLineItemOrder));
        return this;
    }

    public MyShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder(
            final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
        return this;
    }

    public java.util.List<String> getTextLineItemOrder() {
        return this.textLineItemOrder;
    }

    public MyShoppingListChangeTextLineItemsOrderAction build() {
        return new MyShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }

    public static MyShoppingListChangeTextLineItemsOrderActionBuilder of() {
        return new MyShoppingListChangeTextLineItemsOrderActionBuilder();
    }

    public static MyShoppingListChangeTextLineItemsOrderActionBuilder of(
            final MyShoppingListChangeTextLineItemsOrderAction template) {
        MyShoppingListChangeTextLineItemsOrderActionBuilder builder = new MyShoppingListChangeTextLineItemsOrderActionBuilder();
        builder.textLineItemOrder = template.getTextLineItemOrder();
        return builder;
    }

}
