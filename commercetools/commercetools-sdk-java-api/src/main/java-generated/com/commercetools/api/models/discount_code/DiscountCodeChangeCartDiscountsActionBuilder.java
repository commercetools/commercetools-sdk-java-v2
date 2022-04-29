
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeChangeCartDiscountsActionBuilder implements Builder<DiscountCodeChangeCartDiscountsAction> {

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;

    public DiscountCodeChangeCartDiscountsActionBuilder cartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
        return this;
    }

    public DiscountCodeChangeCartDiscountsActionBuilder cartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
        return this;
    }

    public DiscountCodeChangeCartDiscountsActionBuilder plusCartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.addAll(Arrays.asList(cartDiscounts));
        return this;
    }

    public DiscountCodeChangeCartDiscountsActionBuilder plusCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder> builder) {
        if (this.cartDiscounts == null) {
            this.cartDiscounts = new ArrayList<>();
        }
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    public DiscountCodeChangeCartDiscountsActionBuilder withCartDiscounts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder, com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder> builder) {
        this.cartDiscounts = new ArrayList<>();
        this.cartDiscounts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts() {
        return this.cartDiscounts;
    }

    public DiscountCodeChangeCartDiscountsAction build() {
        Objects.requireNonNull(cartDiscounts,
            DiscountCodeChangeCartDiscountsAction.class + ": cartDiscounts is missing");
        return new DiscountCodeChangeCartDiscountsActionImpl(cartDiscounts);
    }

    /**
     * builds DiscountCodeChangeCartDiscountsAction without checking for non null required values
     */
    public DiscountCodeChangeCartDiscountsAction buildUnchecked() {
        return new DiscountCodeChangeCartDiscountsActionImpl(cartDiscounts);
    }

    public static DiscountCodeChangeCartDiscountsActionBuilder of() {
        return new DiscountCodeChangeCartDiscountsActionBuilder();
    }

    public static DiscountCodeChangeCartDiscountsActionBuilder of(
            final DiscountCodeChangeCartDiscountsAction template) {
        DiscountCodeChangeCartDiscountsActionBuilder builder = new DiscountCodeChangeCartDiscountsActionBuilder();
        builder.cartDiscounts = template.getCartDiscounts();
        return builder;
    }

}
