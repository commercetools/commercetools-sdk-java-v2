
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListRemoveTextLineItemActionBuilder {

    private String textLineItemId;

    @Nullable
    private Long quantity;

    public MyShoppingListRemoveTextLineItemActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public MyShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    public MyShoppingListRemoveTextLineItemAction build() {
        return new MyShoppingListRemoveTextLineItemActionImpl(textLineItemId, quantity);
    }

    public static MyShoppingListRemoveTextLineItemActionBuilder of() {
        return new MyShoppingListRemoveTextLineItemActionBuilder();
    }

    public static MyShoppingListRemoveTextLineItemActionBuilder of(
            final MyShoppingListRemoveTextLineItemAction template) {
        MyShoppingListRemoveTextLineItemActionBuilder builder = new MyShoppingListRemoveTextLineItemActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
