
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeIsActiveActionBuilder implements Builder<CartDiscountChangeIsActiveAction> {

    private Boolean isActive;

    public CartDiscountChangeIsActiveActionBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public CartDiscountChangeIsActiveAction build() {
        Objects.requireNonNull(isActive, CartDiscountChangeIsActiveAction.class + ": isActive is missing");
        return new CartDiscountChangeIsActiveActionImpl(isActive);
    }

    /**
     * builds CartDiscountChangeIsActiveAction without checking for non null required values
     */
    public CartDiscountChangeIsActiveAction buildUnchecked() {
        return new CartDiscountChangeIsActiveActionImpl(isActive);
    }

    public static CartDiscountChangeIsActiveActionBuilder of() {
        return new CartDiscountChangeIsActiveActionBuilder();
    }

    public static CartDiscountChangeIsActiveActionBuilder of(final CartDiscountChangeIsActiveAction template) {
        CartDiscountChangeIsActiveActionBuilder builder = new CartDiscountChangeIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
