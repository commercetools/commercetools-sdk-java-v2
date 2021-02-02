
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeTargetActionBuilder {

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    public CartDiscountChangeTargetActionBuilder target(
            final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public CartDiscountChangeTargetAction build() {
        return new CartDiscountChangeTargetActionImpl(target);
    }

    public static CartDiscountChangeTargetActionBuilder of() {
        return new CartDiscountChangeTargetActionBuilder();
    }

    public static CartDiscountChangeTargetActionBuilder of(final CartDiscountChangeTargetAction template) {
        CartDiscountChangeTargetActionBuilder builder = new CartDiscountChangeTargetActionBuilder();
        builder.target = template.getTarget();
        return builder;
    }

}
