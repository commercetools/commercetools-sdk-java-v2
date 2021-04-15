
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListChangeTextLineItemNameActionBuilder {

    private String textLineItemId;

    private com.commercetools.api.models.common.LocalizedString name;

    public ShoppingListChangeTextLineItemNameActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public ShoppingListChangeTextLineItemNameActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ShoppingListChangeTextLineItemNameAction build() {
        return new ShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder of() {
        return new ShoppingListChangeTextLineItemNameActionBuilder();
    }

    public static ShoppingListChangeTextLineItemNameActionBuilder of(
            final ShoppingListChangeTextLineItemNameAction template) {
        ShoppingListChangeTextLineItemNameActionBuilder builder = new ShoppingListChangeTextLineItemNameActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        return builder;
    }

}
