
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountSetKeyActionBuilder {

    @Nullable
    private String key;

    public CartDiscountSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CartDiscountSetKeyAction build() {
        return new CartDiscountSetKeyActionImpl(key);
    }

    public static CartDiscountSetKeyActionBuilder of() {
        return new CartDiscountSetKeyActionBuilder();
    }

    public static CartDiscountSetKeyActionBuilder of(final CartDiscountSetKeyAction template) {
        CartDiscountSetKeyActionBuilder builder = new CartDiscountSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
