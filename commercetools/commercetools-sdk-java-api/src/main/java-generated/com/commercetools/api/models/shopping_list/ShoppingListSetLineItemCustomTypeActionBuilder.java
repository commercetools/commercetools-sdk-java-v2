
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetLineItemCustomTypeActionBuilder
        implements Builder<ShoppingListSetLineItemCustomTypeAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public ShoppingListSetLineItemCustomTypeActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public ShoppingListSetLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ShoppingListSetLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public ShoppingListSetLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public ShoppingListSetLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public ShoppingListSetLineItemCustomTypeAction build() {
        Objects.requireNonNull(lineItemId, ShoppingListSetLineItemCustomTypeAction.class + ": lineItemId is missing");
        return new ShoppingListSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    /**
     * builds ShoppingListSetLineItemCustomTypeAction without checking for non null required values
     */
    public ShoppingListSetLineItemCustomTypeAction buildUnchecked() {
        return new ShoppingListSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    public static ShoppingListSetLineItemCustomTypeActionBuilder of() {
        return new ShoppingListSetLineItemCustomTypeActionBuilder();
    }

    public static ShoppingListSetLineItemCustomTypeActionBuilder of(
            final ShoppingListSetLineItemCustomTypeAction template) {
        ShoppingListSetLineItemCustomTypeActionBuilder builder = new ShoppingListSetLineItemCustomTypeActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
