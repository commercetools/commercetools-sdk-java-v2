
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPortionBuilder implements Builder<DiscountedLineItemPortion> {

    private com.commercetools.api.models.cart_discount.CartDiscountReference discount;

    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    public DiscountedLineItemPortionBuilder discount(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        this.discount = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of())
                .build();
        return this;
    }

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
        Objects.requireNonNull(discount, DiscountedLineItemPortion.class + ": discount is missing");
        Objects.requireNonNull(discountedAmount, DiscountedLineItemPortion.class + ": discountedAmount is missing");
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    /**
     * builds DiscountedLineItemPortion without checking for non null required values
     */
    public DiscountedLineItemPortion buildUnchecked() {
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
