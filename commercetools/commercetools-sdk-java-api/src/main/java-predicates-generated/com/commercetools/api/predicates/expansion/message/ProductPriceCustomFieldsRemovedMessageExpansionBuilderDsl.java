
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductPriceCustomFieldsRemovedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductPriceCustomFieldsRemovedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductPriceCustomFieldsRemovedMessageExpansionBuilderDsl of() {
        return new ProductPriceCustomFieldsRemovedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductPriceCustomFieldsRemovedMessageExpansionBuilderDsl of(final List<String> path) {
        return new ProductPriceCustomFieldsRemovedMessageExpansionBuilderDsl(path);
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
}
