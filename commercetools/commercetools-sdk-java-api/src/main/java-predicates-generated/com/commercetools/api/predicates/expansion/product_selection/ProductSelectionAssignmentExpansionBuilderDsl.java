
package com.commercetools.api.predicates.expansion.product_selection;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductSelectionAssignmentExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductSelectionAssignmentExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductSelectionAssignmentExpansionBuilderDsl of() {
        return new ProductSelectionAssignmentExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductSelectionAssignmentExpansionBuilderDsl of(final List<String> path) {
        return new ProductSelectionAssignmentExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product.ProductReferenceExpansionBuilderDsl product() {
        return com.commercetools.api.predicates.expansion.product.ProductReferenceExpansionBuilderDsl
                .of(appendOne(path, "product"));
    }

    public com.commercetools.api.predicates.expansion.product_selection.ProductSelectionReferenceExpansionBuilderDsl productSelection() {
        return com.commercetools.api.predicates.expansion.product_selection.ProductSelectionReferenceExpansionBuilderDsl
                .of(appendOne(path, "productSelection"));
    }
}
