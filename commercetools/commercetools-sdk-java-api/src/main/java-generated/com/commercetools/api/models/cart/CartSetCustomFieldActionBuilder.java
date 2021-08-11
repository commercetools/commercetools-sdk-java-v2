
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomFieldActionBuilder implements Builder<CartSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CartSetCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetCustomFieldAction.class + ": name is missing");
        return new CartSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CartSetCustomFieldAction without checking for non null required values
     */
    public CartSetCustomFieldAction buildUnchecked() {
        return new CartSetCustomFieldActionImpl(name, value);
    }

    public static CartSetCustomFieldActionBuilder of() {
        return new CartSetCustomFieldActionBuilder();
    }

    public static CartSetCustomFieldActionBuilder of(final CartSetCustomFieldAction template) {
        CartSetCustomFieldActionBuilder builder = new CartSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
