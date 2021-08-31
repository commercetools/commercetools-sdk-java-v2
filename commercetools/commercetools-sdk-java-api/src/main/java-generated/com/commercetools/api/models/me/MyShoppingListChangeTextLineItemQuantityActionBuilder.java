
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListChangeTextLineItemQuantityActionBuilder
        implements Builder<MyShoppingListChangeTextLineItemQuantityAction> {

    private String textLineItemId;

    private Long quantity;

    public MyShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public MyShoppingListChangeTextLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public MyShoppingListChangeTextLineItemQuantityAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListChangeTextLineItemQuantityAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(quantity,
            MyShoppingListChangeTextLineItemQuantityAction.class + ": quantity is missing");
        return new MyShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, quantity);
    }

    /**
     * builds MyShoppingListChangeTextLineItemQuantityAction without checking for non null required values
     */
    public MyShoppingListChangeTextLineItemQuantityAction buildUnchecked() {
        return new MyShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, quantity);
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder of() {
        return new MyShoppingListChangeTextLineItemQuantityActionBuilder();
    }

    public static MyShoppingListChangeTextLineItemQuantityActionBuilder of(
            final MyShoppingListChangeTextLineItemQuantityAction template) {
        MyShoppingListChangeTextLineItemQuantityActionBuilder builder = new MyShoppingListChangeTextLineItemQuantityActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
