
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomLineItemCustomFieldActionBuilder {

    private String customLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetCustomLineItemCustomFieldActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CartSetCustomLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetCustomLineItemCustomFieldAction build() {
        return new CartSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder of() {
        return new CartSetCustomLineItemCustomFieldActionBuilder();
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder of(
            final CartSetCustomLineItemCustomFieldAction template) {
        CartSetCustomLineItemCustomFieldActionBuilder builder = new CartSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
