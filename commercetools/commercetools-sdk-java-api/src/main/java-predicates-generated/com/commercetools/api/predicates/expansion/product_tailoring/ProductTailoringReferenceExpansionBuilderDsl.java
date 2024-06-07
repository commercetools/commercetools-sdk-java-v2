
package com.commercetools.api.predicates.expansion.product_tailoring;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductTailoringReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductTailoringReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductTailoringReferenceExpansionBuilderDsl of() {
        return new ProductTailoringReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductTailoringReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ProductTailoringReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_tailoring.ProductTailoringExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.product_tailoring.ProductTailoringExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
