
package com.commercetools.api.predicates.expansion.product_tailoring;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductTailoringExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductTailoringExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductTailoringExpansionBuilderDsl of() {
        return new ProductTailoringExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductTailoringExpansionBuilderDsl of(final List<String> path) {
        return new ProductTailoringExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.product.ProductReferenceExpansionBuilderDsl product() {
        return com.commercetools.api.predicates.expansion.product.ProductReferenceExpansionBuilderDsl
                .of(appendOne(path, "product"));
    }
}
