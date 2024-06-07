
package com.commercetools.api.predicates.expansion.product;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductDataExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductDataExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductDataExpansionBuilderDsl of() {
        return new ProductDataExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductDataExpansionBuilderDsl of(final List<String> path) {
        return new ProductDataExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
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
}
