
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListChangeLineItemQuantityActionBuilder {

    private String lineItemId;

    private Long quantity;

    public ShoppingListChangeLineItemQuantityActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public ShoppingListChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public ShoppingListChangeLineItemQuantityAction build() {
        return new ShoppingListChangeLineItemQuantityActionImpl(lineItemId, quantity);
    }

    public static ShoppingListChangeLineItemQuantityActionBuilder of() {
        return new ShoppingListChangeLineItemQuantityActionBuilder();
    }

    public static ShoppingListChangeLineItemQuantityActionBuilder of(
            final ShoppingListChangeLineItemQuantityAction template) {
        ShoppingListChangeLineItemQuantityActionBuilder builder = new ShoppingListChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
