
package com.commercetools.api.predicates.expansion.product_type;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductTypeReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductTypeReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductTypeReferenceExpansionBuilderDsl of() {
        return new ProductTypeReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductTypeReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ProductTypeReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_type.ProductTypeExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.product_type.ProductTypeExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
