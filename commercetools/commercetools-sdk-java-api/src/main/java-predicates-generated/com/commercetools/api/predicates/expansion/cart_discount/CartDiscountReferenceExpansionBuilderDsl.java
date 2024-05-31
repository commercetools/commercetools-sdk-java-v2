
package com.commercetools.api.predicates.expansion.cart_discount;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CartDiscountReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CartDiscountReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CartDiscountReferenceExpansionBuilderDsl of() {
        return new CartDiscountReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CartDiscountReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CartDiscountReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.cart_discount.CartDiscountExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.cart_discount.CartDiscountExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
