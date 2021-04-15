
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountSetCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartDiscountSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartDiscountSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CartDiscountSetCustomFieldAction build() {
        return new CartDiscountSetCustomFieldActionImpl(name, value);
    }

    public static CartDiscountSetCustomFieldActionBuilder of() {
        return new CartDiscountSetCustomFieldActionBuilder();
    }

    public static CartDiscountSetCustomFieldActionBuilder of(final CartDiscountSetCustomFieldAction template) {
        CartDiscountSetCustomFieldActionBuilder builder = new CartDiscountSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
