
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListRemoveLineItemActionBuilder {

    private String lineItemId;

    @Nullable
    private Long quantity;

    public MyShoppingListRemoveLineItemActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public MyShoppingListRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    public MyShoppingListRemoveLineItemAction build() {
        return new MyShoppingListRemoveLineItemActionImpl(lineItemId, quantity);
    }

    public static MyShoppingListRemoveLineItemActionBuilder of() {
        return new MyShoppingListRemoveLineItemActionBuilder();
    }

    public static MyShoppingListRemoveLineItemActionBuilder of(final MyShoppingListRemoveLineItemAction template) {
        MyShoppingListRemoveLineItemActionBuilder builder = new MyShoppingListRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
