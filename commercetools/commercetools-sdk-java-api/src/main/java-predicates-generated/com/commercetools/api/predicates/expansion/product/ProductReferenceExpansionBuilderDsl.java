
package com.commercetools.api.predicates.expansion.product;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductReferenceExpansionBuilderDsl of() {
        return new ProductReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ProductReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product.ProductExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.product.ProductExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
