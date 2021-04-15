
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetTextLineItemDescriptionActionBuilder {

    private String textLineItemId;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public ShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public ShoppingListSetTextLineItemDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public ShoppingListSetTextLineItemDescriptionAction build() {
        return new ShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, description);
    }

    public static ShoppingListSetTextLineItemDescriptionActionBuilder of() {
        return new ShoppingListSetTextLineItemDescriptionActionBuilder();
    }

    public static ShoppingListSetTextLineItemDescriptionActionBuilder of(
            final ShoppingListSetTextLineItemDescriptionAction template) {
        ShoppingListSetTextLineItemDescriptionActionBuilder builder = new ShoppingListSetTextLineItemDescriptionActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.description = template.getDescription();
        return builder;
    }

}
