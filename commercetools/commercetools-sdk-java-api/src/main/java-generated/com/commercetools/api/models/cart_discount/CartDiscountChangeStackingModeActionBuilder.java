
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeStackingModeActionBuilder
        implements Builder<CartDiscountChangeStackingModeAction> {

    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    public CartDiscountChangeStackingModeActionBuilder stackingMode(
            final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        return this;
    }

    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    public CartDiscountChangeStackingModeAction build() {
        Objects.requireNonNull(stackingMode, CartDiscountChangeStackingModeAction.class + ": stackingMode is missing");
        return new CartDiscountChangeStackingModeActionImpl(stackingMode);
    }

    /**
     * builds CartDiscountChangeStackingModeAction without checking for non null required values
     */
    public CartDiscountChangeStackingModeAction buildUnchecked() {
        return new CartDiscountChangeStackingModeActionImpl(stackingMode);
    }

    public static CartDiscountChangeStackingModeActionBuilder of() {
        return new CartDiscountChangeStackingModeActionBuilder();
    }

    public static CartDiscountChangeStackingModeActionBuilder of(final CartDiscountChangeStackingModeAction template) {
        CartDiscountChangeStackingModeActionBuilder builder = new CartDiscountChangeStackingModeActionBuilder();
        builder.stackingMode = template.getStackingMode();
        return builder;
    }

}
