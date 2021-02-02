
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLineItemCustomFieldActionBuilder {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CartSetLineItemCustomFieldAction build() {
        return new CartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static CartSetLineItemCustomFieldActionBuilder of() {
        return new CartSetLineItemCustomFieldActionBuilder();
    }

    public static CartSetLineItemCustomFieldActionBuilder of(final CartSetLineItemCustomFieldAction template) {
        CartSetLineItemCustomFieldActionBuilder builder = new CartSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
