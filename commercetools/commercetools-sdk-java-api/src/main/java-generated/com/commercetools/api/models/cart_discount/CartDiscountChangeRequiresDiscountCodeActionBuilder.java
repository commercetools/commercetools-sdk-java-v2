
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeRequiresDiscountCodeActionBuilder
        implements Builder<CartDiscountChangeRequiresDiscountCodeAction> {

    private Boolean requiresDiscountCode;

    public CartDiscountChangeRequiresDiscountCodeActionBuilder requiresDiscountCode(
            final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        return this;
    }

    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    public CartDiscountChangeRequiresDiscountCodeAction build() {
        Objects.requireNonNull(requiresDiscountCode,
            CartDiscountChangeRequiresDiscountCodeAction.class + ": requiresDiscountCode is missing");
        return new CartDiscountChangeRequiresDiscountCodeActionImpl(requiresDiscountCode);
    }

    /**
     * builds CartDiscountChangeRequiresDiscountCodeAction without checking for non null required values
     */
    public CartDiscountChangeRequiresDiscountCodeAction buildUnchecked() {
        return new CartDiscountChangeRequiresDiscountCodeActionImpl(requiresDiscountCode);
    }

    public static CartDiscountChangeRequiresDiscountCodeActionBuilder of() {
        return new CartDiscountChangeRequiresDiscountCodeActionBuilder();
    }

    public static CartDiscountChangeRequiresDiscountCodeActionBuilder of(
            final CartDiscountChangeRequiresDiscountCodeAction template) {
        CartDiscountChangeRequiresDiscountCodeActionBuilder builder = new CartDiscountChangeRequiresDiscountCodeActionBuilder();
        builder.requiresDiscountCode = template.getRequiresDiscountCode();
        return builder;
    }

}
