
package com.commercetools.api.predicates.expansion.common;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountedPriceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountedPriceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountedPriceExpansionBuilderDsl of() {
        return new DiscountedPriceExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountedPriceExpansionBuilderDsl of(final List<String> path) {
        return new DiscountedPriceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_discount.ProductDiscountReferenceExpansionBuilderDsl discount() {
        return com.commercetools.api.predicates.expansion.product_discount.ProductDiscountReferenceExpansionBuilderDsl
                .of(appendOne(path, "discount"));
    }
}
