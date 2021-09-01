
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetTextLineItemDescriptionActionBuilder
        implements Builder<MyShoppingListSetTextLineItemDescriptionAction> {

    private String textLineItemId;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public MyShoppingListSetTextLineItemDescriptionActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public MyShoppingListSetTextLineItemDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public MyShoppingListSetTextLineItemDescriptionActionBuilder description(
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

    public MyShoppingListSetTextLineItemDescriptionAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListSetTextLineItemDescriptionAction.class + ": textLineItemId is missing");
        return new MyShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, description);
    }

    /**
     * builds MyShoppingListSetTextLineItemDescriptionAction without checking for non null required values
     */
    public MyShoppingListSetTextLineItemDescriptionAction buildUnchecked() {
        return new MyShoppingListSetTextLineItemDescriptionActionImpl(textLineItemId, description);
    }

    public static MyShoppingListSetTextLineItemDescriptionActionBuilder of() {
        return new MyShoppingListSetTextLineItemDescriptionActionBuilder();
    }

    public static MyShoppingListSetTextLineItemDescriptionActionBuilder of(
            final MyShoppingListSetTextLineItemDescriptionAction template) {
        MyShoppingListSetTextLineItemDescriptionActionBuilder builder = new MyShoppingListSetTextLineItemDescriptionActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.description = template.getDescription();
        return builder;
    }

}
