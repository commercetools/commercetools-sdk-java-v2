
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPortionBuilder {

    private com.commercetools.api.models.cart_discount.CartDiscountReference discount;

    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    public DiscountedLineItemPortionBuilder discount(
            final com.commercetools.api.models.cart_discount.CartDiscountReference discount) {
        this.discount = discount;
        return this;
    }

    public DiscountedLineItemPortionBuilder discountedAmount(
            final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountReference getDiscount() {
        return this.discount;
    }

    public com.commercetools.api.models.common.TypedMoney getDiscountedAmount() {
        return this.discountedAmount;
    }

    public DiscountedLineItemPortion build() {
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    public static DiscountedLineItemPortionBuilder of() {
        return new DiscountedLineItemPortionBuilder();
    }

    public static DiscountedLineItemPortionBuilder of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionBuilder builder = new DiscountedLineItemPortionBuilder();
        builder.discount = template.getDiscount();
        builder.discountedAmount = template.getDiscountedAmount();
        return builder;
    }

}
