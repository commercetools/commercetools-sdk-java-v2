
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetCustomFieldActionBuilder implements Builder<MyShoppingListSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public MyShoppingListSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public MyShoppingListSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public MyShoppingListSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyShoppingListSetCustomFieldAction.class + ": name is missing");
        return new MyShoppingListSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyShoppingListSetCustomFieldAction without checking for non null required values
     */
    public MyShoppingListSetCustomFieldAction buildUnchecked() {
        return new MyShoppingListSetCustomFieldActionImpl(name, value);
    }

    public static MyShoppingListSetCustomFieldActionBuilder of() {
        return new MyShoppingListSetCustomFieldActionBuilder();
    }

    public static MyShoppingListSetCustomFieldActionBuilder of(final MyShoppingListSetCustomFieldAction template) {
        MyShoppingListSetCustomFieldActionBuilder builder = new MyShoppingListSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
