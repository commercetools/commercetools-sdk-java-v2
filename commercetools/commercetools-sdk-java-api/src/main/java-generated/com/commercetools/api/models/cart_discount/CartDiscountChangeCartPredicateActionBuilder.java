
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeCartPredicateActionBuilder
        implements Builder<CartDiscountChangeCartPredicateAction> {

    private String cartPredicate;

    public CartDiscountChangeCartPredicateActionBuilder cartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    public String getCartPredicate() {
        return this.cartPredicate;
    }

    public CartDiscountChangeCartPredicateAction build() {
        Objects.requireNonNull(cartPredicate,
            CartDiscountChangeCartPredicateAction.class + ": cartPredicate is missing");
        return new CartDiscountChangeCartPredicateActionImpl(cartPredicate);
    }

    /**
     * builds CartDiscountChangeCartPredicateAction without checking for non null required values
     */
    public CartDiscountChangeCartPredicateAction buildUnchecked() {
        return new CartDiscountChangeCartPredicateActionImpl(cartPredicate);
    }

    public static CartDiscountChangeCartPredicateActionBuilder of() {
        return new CartDiscountChangeCartPredicateActionBuilder();
    }

    public static CartDiscountChangeCartPredicateActionBuilder of(
            final CartDiscountChangeCartPredicateAction template) {
        CartDiscountChangeCartPredicateActionBuilder builder = new CartDiscountChangeCartPredicateActionBuilder();
        builder.cartPredicate = template.getCartPredicate();
        return builder;
    }

}
