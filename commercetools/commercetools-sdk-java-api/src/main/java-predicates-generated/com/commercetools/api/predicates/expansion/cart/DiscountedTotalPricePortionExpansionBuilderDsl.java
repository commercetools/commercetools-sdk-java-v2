
package com.commercetools.api.predicates.expansion.cart;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountedTotalPricePortionExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountedTotalPricePortionExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountedTotalPricePortionExpansionBuilderDsl of() {
        return new DiscountedTotalPricePortionExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountedTotalPricePortionExpansionBuilderDsl of(final List<String> path) {
        return new DiscountedTotalPricePortionExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl discount() {
        return com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl
                .of(appendOne(path, "discount"));
    }
}
