
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscountLineItemsTarget;
import com.commercetools.api.models.cart_discount.CartDiscountTarget;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountLineItemsTargetBuilder {

    private String predicate;

    public CartDiscountLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public CartDiscountLineItemsTarget build() {
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
