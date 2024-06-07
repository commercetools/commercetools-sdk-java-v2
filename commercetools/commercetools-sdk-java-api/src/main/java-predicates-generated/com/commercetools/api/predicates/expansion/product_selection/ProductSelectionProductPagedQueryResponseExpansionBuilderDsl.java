
package com.commercetools.api.predicates.expansion.product_selection;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductSelectionProductPagedQueryResponseExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductSelectionProductPagedQueryResponseExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductSelectionProductPagedQueryResponseExpansionBuilderDsl of() {
        return new ProductSelectionProductPagedQueryResponseExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductSelectionProductPagedQueryResponseExpansionBuilderDsl of(final List<String> path) {
        return new ProductSelectionProductPagedQueryResponseExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_selection.AssignedProductReferenceExpansionBuilderDsl results() {
        return com.commercetools.api.predicates.expansion.product_selection.AssignedProductReferenceExpansionBuilderDsl
                .of(appendOne(path, "results[*]"));
    }

    public com.commercetools.api.predicates.expansion.product_selection.AssignedProductReferenceExpansionBuilderDsl results(
            long index) {
        return com.commercetools.api.predicates.expansion.product_selection.AssignedProductReferenceExpansionBuilderDsl
                .of(appendOne(path, "results[" + index + "]"));
    }
}
