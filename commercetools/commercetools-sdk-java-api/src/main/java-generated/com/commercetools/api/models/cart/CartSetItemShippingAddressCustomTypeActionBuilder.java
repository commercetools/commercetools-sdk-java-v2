
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetItemShippingAddressCustomTypeActionBuilder
        implements Builder<CartSetItemShippingAddressCustomTypeAction> {

    private String addressKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public CartSetItemShippingAddressCustomTypeActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public CartSetItemShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public CartSetItemShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public CartSetItemShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public CartSetItemShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CartSetItemShippingAddressCustomTypeAction build() {
        Objects.requireNonNull(addressKey,
            CartSetItemShippingAddressCustomTypeAction.class + ": addressKey is missing");
        return new CartSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * builds CartSetItemShippingAddressCustomTypeAction without checking for non null required values
     */
    public CartSetItemShippingAddressCustomTypeAction buildUnchecked() {
        return new CartSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    public static CartSetItemShippingAddressCustomTypeActionBuilder of() {
        return new CartSetItemShippingAddressCustomTypeActionBuilder();
    }

    public static CartSetItemShippingAddressCustomTypeActionBuilder of(
            final CartSetItemShippingAddressCustomTypeAction template) {
        CartSetItemShippingAddressCustomTypeActionBuilder builder = new CartSetItemShippingAddressCustomTypeActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
