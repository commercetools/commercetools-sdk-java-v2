
package com.commercetools.api.predicates.expansion.product_type;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductTypeExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductTypeExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductTypeExpansionBuilderDsl of() {
        return new ProductTypeExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductTypeExpansionBuilderDsl of(final List<String> path) {
        return new ProductTypeExpansionBuilderDsl(path);
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
}
