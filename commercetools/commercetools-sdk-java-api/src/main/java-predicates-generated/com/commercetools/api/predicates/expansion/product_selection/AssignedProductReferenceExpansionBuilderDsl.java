
package com.commercetools.api.predicates.expansion.product_selection;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class AssignedProductReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private AssignedProductReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static AssignedProductReferenceExpansionBuilderDsl of() {
        return new AssignedProductReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static AssignedProductReferenceExpansionBuilderDsl of(final List<String> path) {
        return new AssignedProductReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product.ProductReferenceExpansionBuilderDsl product() {
        return com.commercetools.api.predicates.expansion.product.ProductReferenceExpansionBuilderDsl
                .of(appendOne(path, "product"));
    }
}
