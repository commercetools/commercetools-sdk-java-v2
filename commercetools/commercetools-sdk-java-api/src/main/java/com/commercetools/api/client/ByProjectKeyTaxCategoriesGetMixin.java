
package com.commercetools.api.client;

import com.commercetools.api.models.tax_category.TaxCategoryPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.tax_category.TaxCategoryExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.tax_category.TaxCategoryQueryBuilderDsl;

public interface ByProjectKeyTaxCategoriesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyTaxCategoriesGet, TaxCategoryPagedQueryResponse, TaxCategoryQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyTaxCategoriesGet, TaxCategoryExpansionBuilderDsl> {

    @Override
    default TaxCategoryExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.taxCategory();
    }

    @Override
    default TaxCategoryQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.taxCategory();
    }
}
