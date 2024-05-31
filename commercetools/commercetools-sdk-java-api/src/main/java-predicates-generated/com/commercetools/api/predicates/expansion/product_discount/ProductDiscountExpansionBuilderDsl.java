
package com.commercetools.api.predicates.expansion.product_discount;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductDiscountExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductDiscountExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductDiscountExpansionBuilderDsl of() {
        return new ProductDiscountExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductDiscountExpansionBuilderDsl of(final List<String> path) {
        return new ProductDiscountExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl references() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "references[*]"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl references(long index) {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "references[" + index + "]"));
    }
}
