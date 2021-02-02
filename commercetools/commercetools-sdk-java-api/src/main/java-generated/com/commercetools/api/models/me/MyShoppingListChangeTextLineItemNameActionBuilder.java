
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListChangeTextLineItemNameActionBuilder {

    private String textLineItemId;

    private com.commercetools.api.models.common.LocalizedString name;

    public MyShoppingListChangeTextLineItemNameActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public MyShoppingListChangeTextLineItemNameActionBuilder name(
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

    public MyShoppingListChangeTextLineItemNameAction build() {
        return new MyShoppingListChangeTextLineItemNameActionImpl(textLineItemId, name);
    }

    public static MyShoppingListChangeTextLineItemNameActionBuilder of() {
        return new MyShoppingListChangeTextLineItemNameActionBuilder();
    }

    public static MyShoppingListChangeTextLineItemNameActionBuilder of(
            final MyShoppingListChangeTextLineItemNameAction template) {
        MyShoppingListChangeTextLineItemNameActionBuilder builder = new MyShoppingListChangeTextLineItemNameActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        return builder;
    }

}
