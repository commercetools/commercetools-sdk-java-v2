
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetTextLineItemCustomFieldActionBuilder
        implements Builder<MyShoppingListSetTextLineItemCustomFieldAction> {

    private String textLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public MyShoppingListSetTextLineItemCustomFieldAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListSetTextLineItemCustomFieldAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(name, MyShoppingListSetTextLineItemCustomFieldAction.class + ": name is missing");
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    /**
     * builds MyShoppingListSetTextLineItemCustomFieldAction without checking for non null required values
     */
    public MyShoppingListSetTextLineItemCustomFieldAction buildUnchecked() {
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of() {
        return new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of(
            final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionBuilder builder = new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
