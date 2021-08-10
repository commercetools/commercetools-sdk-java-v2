
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetBillingAddressCustomTypeActionBuilder
        implements Builder<CartSetBillingAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public CartSetBillingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public CartSetBillingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CartSetBillingAddressCustomTypeAction build() {
        return new CartSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CartSetBillingAddressCustomTypeAction without checking for non null required values
     */
    public CartSetBillingAddressCustomTypeAction buildUnchecked() {
        return new CartSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    public static CartSetBillingAddressCustomTypeActionBuilder of() {
        return new CartSetBillingAddressCustomTypeActionBuilder();
    }

    public static CartSetBillingAddressCustomTypeActionBuilder of(
            final CartSetBillingAddressCustomTypeAction template) {
        CartSetBillingAddressCustomTypeActionBuilder builder = new CartSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
