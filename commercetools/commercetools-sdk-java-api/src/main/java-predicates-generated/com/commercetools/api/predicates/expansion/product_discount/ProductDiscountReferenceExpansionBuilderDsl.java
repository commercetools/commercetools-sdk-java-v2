
package com.commercetools.api.predicates.expansion.product_discount;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductDiscountReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductDiscountReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductDiscountReferenceExpansionBuilderDsl of() {
        return new ProductDiscountReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductDiscountReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ProductDiscountReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_discount.ProductDiscountExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.product_discount.ProductDiscountExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
