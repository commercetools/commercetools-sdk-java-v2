
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetLineItemCustomFieldActionBuilder
        implements Builder<ShoppingListSetLineItemCustomFieldAction> {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public ShoppingListSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public ShoppingListSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ShoppingListSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ShoppingListSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(lineItemId, ShoppingListSetLineItemCustomFieldAction.class + ": lineItemId is missing");
        Objects.requireNonNull(name, ShoppingListSetLineItemCustomFieldAction.class + ": name is missing");
        return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * builds ShoppingListSetLineItemCustomFieldAction without checking for non null required values
     */
    public ShoppingListSetLineItemCustomFieldAction buildUnchecked() {
        return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder of() {
        return new ShoppingListSetLineItemCustomFieldActionBuilder();
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder of(
            final ShoppingListSetLineItemCustomFieldAction template) {
        ShoppingListSetLineItemCustomFieldActionBuilder builder = new ShoppingListSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
