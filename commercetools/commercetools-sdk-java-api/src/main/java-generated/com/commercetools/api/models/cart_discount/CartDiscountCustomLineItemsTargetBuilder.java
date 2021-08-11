
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountCustomLineItemsTargetBuilder implements Builder<CartDiscountCustomLineItemsTarget> {

    private String predicate;

    public CartDiscountCustomLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public CartDiscountCustomLineItemsTarget build() {
        Objects.requireNonNull(predicate, CartDiscountCustomLineItemsTarget.class + ": predicate is missing");
        return new CartDiscountCustomLineItemsTargetImpl(predicate);
    }

    /**
     * builds CartDiscountCustomLineItemsTarget without checking for non null required values
     */
    public CartDiscountCustomLineItemsTarget buildUnchecked() {
        return new CartDiscountCustomLineItemsTargetImpl(predicate);
    }

    public static CartDiscountCustomLineItemsTargetBuilder of() {
        return new CartDiscountCustomLineItemsTargetBuilder();
    }

    public static CartDiscountCustomLineItemsTargetBuilder of(final CartDiscountCustomLineItemsTarget template) {
        CartDiscountCustomLineItemsTargetBuilder builder = new CartDiscountCustomLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
