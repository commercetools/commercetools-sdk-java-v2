
package com.commercetools.api.predicates.expansion.tax_category;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class TaxCategoryExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private TaxCategoryExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static TaxCategoryExpansionBuilderDsl of() {
        return new TaxCategoryExpansionBuilderDsl(Collections.emptyList());
    }

    public static TaxCategoryExpansionBuilderDsl of(final List<String> path) {
        return new TaxCategoryExpansionBuilderDsl(path);
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
