
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetTextLineItemCustomTypeActionBuilder
        implements Builder<ShoppingListSetTextLineItemCustomTypeAction> {

    private String textLineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public ShoppingListSetTextLineItemCustomTypeActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public ShoppingListSetTextLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ShoppingListSetTextLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public ShoppingListSetTextLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public ShoppingListSetTextLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public ShoppingListSetTextLineItemCustomTypeAction build() {
        Objects.requireNonNull(textLineItemId,
            ShoppingListSetTextLineItemCustomTypeAction.class + ": textLineItemId is missing");
        return new ShoppingListSetTextLineItemCustomTypeActionImpl(textLineItemId, type, fields);
    }

    /**
     * builds ShoppingListSetTextLineItemCustomTypeAction without checking for non null required values
     */
    public ShoppingListSetTextLineItemCustomTypeAction buildUnchecked() {
        return new ShoppingListSetTextLineItemCustomTypeActionImpl(textLineItemId, type, fields);
    }

    public static ShoppingListSetTextLineItemCustomTypeActionBuilder of() {
        return new ShoppingListSetTextLineItemCustomTypeActionBuilder();
    }

    public static ShoppingListSetTextLineItemCustomTypeActionBuilder of(
            final ShoppingListSetTextLineItemCustomTypeAction template) {
        ShoppingListSetTextLineItemCustomTypeActionBuilder builder = new ShoppingListSetTextLineItemCustomTypeActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
