
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListChangeLineItemQuantityActionBuilder {

    private String lineItemId;

    private Long quantity;

    public MyShoppingListChangeLineItemQuantityActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyShoppingListChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public MyShoppingListChangeLineItemQuantityAction build() {
        return new MyShoppingListChangeLineItemQuantityActionImpl(lineItemId, quantity);
    }

    public static MyShoppingListChangeLineItemQuantityActionBuilder of() {
        return new MyShoppingListChangeLineItemQuantityActionBuilder();
    }

    public static MyShoppingListChangeLineItemQuantityActionBuilder of(
            final MyShoppingListChangeLineItemQuantityAction template) {
        MyShoppingListChangeLineItemQuantityActionBuilder builder = new MyShoppingListChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
