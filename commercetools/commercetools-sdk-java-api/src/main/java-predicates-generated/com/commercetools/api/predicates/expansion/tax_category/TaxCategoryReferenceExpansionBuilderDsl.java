
package com.commercetools.api.predicates.expansion.tax_category;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class TaxCategoryReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private TaxCategoryReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static TaxCategoryReferenceExpansionBuilderDsl of() {
        return new TaxCategoryReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static TaxCategoryReferenceExpansionBuilderDsl of(final List<String> path) {
        return new TaxCategoryReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.tax_category.TaxCategoryExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.tax_category.TaxCategoryExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
