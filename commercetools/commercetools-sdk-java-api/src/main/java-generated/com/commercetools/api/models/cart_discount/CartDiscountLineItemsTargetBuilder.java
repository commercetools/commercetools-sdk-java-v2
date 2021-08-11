
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountLineItemsTargetBuilder implements Builder<CartDiscountLineItemsTarget> {

    private String predicate;

    public CartDiscountLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public CartDiscountLineItemsTarget build() {
        Objects.requireNonNull(predicate, CartDiscountLineItemsTarget.class + ": predicate is missing");
        return new CartDiscountLineItemsTargetImpl(predicate);
    }

    /**
     * builds CartDiscountLineItemsTarget without checking for non null required values
     */
    public CartDiscountLineItemsTarget buildUnchecked() {
        return new CartDiscountLineItemsTargetImpl(predicate);
    }

    public static CartDiscountLineItemsTargetBuilder of() {
        return new CartDiscountLineItemsTargetBuilder();
    }

    public static CartDiscountLineItemsTargetBuilder of(final CartDiscountLineItemsTarget template) {
        CartDiscountLineItemsTargetBuilder builder = new CartDiscountLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
