
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomFieldActionBuilder {

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
