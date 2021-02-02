
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountCustomLineItemsTargetBuilder {

    private String predicate;

    public CartDiscountCustomLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public CartDiscountCustomLineItemsTarget build() {
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
