
package com.commercetools.api.predicates.expansion.product;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductProjectionExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductProjectionExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductProjectionExpansionBuilderDsl of() {
        return new ProductProjectionExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductProjectionExpansionBuilderDsl of(final List<String> path) {
        return new ProductProjectionExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl productType() {
        return com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl
                .of(appendOne(path, "productType"));
    }

    public com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl categories() {
        return com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "categories[*]"));
    }

    public com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl categories(
            long index) {
        return com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "categories[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl masterVariant() {
        return com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl
                .of(appendOne(path, "masterVariant"));
    }

    public com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl variants() {
        return com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl
                .of(appendOne(path, "variants[*]"));
    }

    public com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl variants(long index) {
        return com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl
                .of(appendOne(path, "variants[" + index + "]"));
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
