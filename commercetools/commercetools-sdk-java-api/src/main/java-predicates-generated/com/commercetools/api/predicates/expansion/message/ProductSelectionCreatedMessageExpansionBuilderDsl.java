
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductSelectionCreatedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductSelectionCreatedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductSelectionCreatedMessageExpansionBuilderDsl of() {
        return new ProductSelectionCreatedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductSelectionCreatedMessageExpansionBuilderDsl of(final List<String> path) {
        return new ProductSelectionCreatedMessageExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
    }

    public com.commercetools.api.predicates.expansion.product_selection.ProductSelectionExpansionBuilderDsl productSelection() {
        return com.commercetools.api.predicates.expansion.product_selection.ProductSelectionExpansionBuilderDsl
                .of(appendOne(path, "productSelection"));
    }
}
