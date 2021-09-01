
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetCustomFieldActionBuilder implements Builder<ShoppingListSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public ShoppingListSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ShoppingListSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ShoppingListSetCustomFieldAction build() {
        Objects.requireNonNull(name, ShoppingListSetCustomFieldAction.class + ": name is missing");
        return new ShoppingListSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ShoppingListSetCustomFieldAction without checking for non null required values
     */
    public ShoppingListSetCustomFieldAction buildUnchecked() {
        return new ShoppingListSetCustomFieldActionImpl(name, value);
    }

    public static ShoppingListSetCustomFieldActionBuilder of() {
        return new ShoppingListSetCustomFieldActionBuilder();
    }

    public static ShoppingListSetCustomFieldActionBuilder of(final ShoppingListSetCustomFieldAction template) {
        ShoppingListSetCustomFieldActionBuilder builder = new ShoppingListSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
