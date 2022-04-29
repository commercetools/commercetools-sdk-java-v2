
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyShoppingListChangeTextLineItemsOrderActionBuilder
        implements Builder<MyShoppingListChangeTextLineItemsOrderAction> {

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

    public MyShoppingListChangeTextLineItemsOrderActionBuilder plusTextLineItemOrder(
            final String... textLineItemOrder) {
        if (this.textLineItemOrder == null) {
            this.textLineItemOrder = new ArrayList<>();
        }
        this.textLineItemOrder.addAll(Arrays.asList(textLineItemOrder));
        return this;
    }

    public java.util.List<String> getTextLineItemOrder() {
        return this.textLineItemOrder;
    }

    public MyShoppingListChangeTextLineItemsOrderAction build() {
        Objects.requireNonNull(textLineItemOrder,
            MyShoppingListChangeTextLineItemsOrderAction.class + ": textLineItemOrder is missing");
        return new MyShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }

    /**
     * builds MyShoppingListChangeTextLineItemsOrderAction without checking for non null required values
     */
    public MyShoppingListChangeTextLineItemsOrderAction buildUnchecked() {
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
