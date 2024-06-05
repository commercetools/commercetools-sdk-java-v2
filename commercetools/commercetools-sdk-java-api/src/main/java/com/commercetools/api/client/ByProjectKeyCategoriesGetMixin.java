
package com.commercetools.api.client;

import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.category.CategoryExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl;

public interface ByProjectKeyCategoriesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCategoriesGet, CategoryPagedQueryResponse, CategoryQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyCategoriesGet, CategoryExpansionBuilderDsl> {

    @Override
    default CategoryExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.category();
    }

    @Override
    default CategoryQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.category();
    }
}
