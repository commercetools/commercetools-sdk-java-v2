
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartDiscountValueFixedBuilder implements Builder<CartDiscountValueFixed> {

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

    public CartDiscountValueFixedBuilder plusMoney(final com.commercetools.api.models.common.TypedMoney... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    public CartDiscountValueFixedBuilder plusMoney(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    public CartDiscountValueFixedBuilder withMoney(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build());
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
