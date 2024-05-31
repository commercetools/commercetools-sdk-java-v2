
package com.commercetools.api.predicates.expansion.product;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductExpansionBuilderDsl of() {
        return new ProductExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductExpansionBuilderDsl of(final List<String> path) {
        return new ProductExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl productType() {
        return com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl
                .of(appendOne(path, "productType"));
    }

    public com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl taxCategory() {
        return com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "taxCategory"));
    }

    public com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.state.StateReferenceExpansionBuilderDsl
                .of(appendOne(path, "state"));
    }
}
