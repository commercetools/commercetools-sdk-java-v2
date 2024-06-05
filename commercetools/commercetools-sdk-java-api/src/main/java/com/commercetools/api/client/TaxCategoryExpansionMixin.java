
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.tax_category.TaxCategoryExpansionBuilderDsl;

public interface TaxCategoryExpansionMixin<T extends ExpandableRequest<T, TaxCategoryExpansionBuilderDsl>>
        extends ExpandableRequest<T, TaxCategoryExpansionBuilderDsl> {
    @Override
    default TaxCategoryExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.taxCategory();
    }
}
