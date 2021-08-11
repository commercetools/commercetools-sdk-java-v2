
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueFixedBuilder implements Builder<CartDiscountValueFixed> {

    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    public CartDiscountValueFixedBuilder money(final com.commercetools.api.models.common.TypedMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public CartDiscountValueFixedBuilder money(
            final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney() {
        return this.money;
    }

    public CartDiscountValueFixed build() {
        Objects.requireNonNull(money, CartDiscountValueFixed.class + ": money is missing");
        return new CartDiscountValueFixedImpl(money);
    }

    /**
     * builds CartDiscountValueFixed without checking for non null required values
     */
    public CartDiscountValueFixed buildUnchecked() {
        return new CartDiscountValueFixedImpl(money);
    }

    public static CartDiscountValueFixedBuilder of() {
        return new CartDiscountValueFixedBuilder();
    }

    public static CartDiscountValueFixedBuilder of(final CartDiscountValueFixed template) {
        CartDiscountValueFixedBuilder builder = new CartDiscountValueFixedBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
