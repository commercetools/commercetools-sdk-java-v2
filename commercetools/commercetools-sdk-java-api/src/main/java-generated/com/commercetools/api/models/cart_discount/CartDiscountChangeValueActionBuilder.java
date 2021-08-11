
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeValueActionBuilder implements Builder<CartDiscountChangeValueAction> {

    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    public CartDiscountChangeValueActionBuilder value(
            final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue() {
        return this.value;
    }

    public CartDiscountChangeValueAction build() {
        Objects.requireNonNull(value, CartDiscountChangeValueAction.class + ": value is missing");
        return new CartDiscountChangeValueActionImpl(value);
    }

    /**
     * builds CartDiscountChangeValueAction without checking for non null required values
     */
    public CartDiscountChangeValueAction buildUnchecked() {
        return new CartDiscountChangeValueActionImpl(value);
    }

    public static CartDiscountChangeValueActionBuilder of() {
        return new CartDiscountChangeValueActionBuilder();
    }

    public static CartDiscountChangeValueActionBuilder of(final CartDiscountChangeValueAction template) {
        CartDiscountChangeValueActionBuilder builder = new CartDiscountChangeValueActionBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
