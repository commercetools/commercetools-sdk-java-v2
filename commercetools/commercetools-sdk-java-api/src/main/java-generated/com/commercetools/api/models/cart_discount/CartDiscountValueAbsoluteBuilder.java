
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueAbsoluteBuilder {

    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    public CartDiscountValueAbsoluteBuilder money(final com.commercetools.api.models.common.TypedMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public CartDiscountValueAbsoluteBuilder money(
            final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney() {
        return this.money;
    }

    public CartDiscountValueAbsolute build() {
        return new CartDiscountValueAbsoluteImpl(money);
    }

    public static CartDiscountValueAbsoluteBuilder of() {
        return new CartDiscountValueAbsoluteBuilder();
    }

    public static CartDiscountValueAbsoluteBuilder of(final CartDiscountValueAbsolute template) {
        CartDiscountValueAbsoluteBuilder builder = new CartDiscountValueAbsoluteBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
