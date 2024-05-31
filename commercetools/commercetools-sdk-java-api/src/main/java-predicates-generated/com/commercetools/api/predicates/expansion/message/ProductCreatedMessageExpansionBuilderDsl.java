
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductCreatedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductCreatedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductCreatedMessageExpansionBuilderDsl of() {
        return new ProductCreatedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductCreatedMessageExpansionBuilderDsl of(final List<String> path) {
        return new ProductCreatedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.product.ProductProjectionExpansionBuilderDsl productProjection() {
        return com.commercetools.api.predicates.expansion.product.ProductProjectionExpansionBuilderDsl
                .of(appendOne(path, "productProjection"));
    }
}
