
package com.commercetools.api.client;

import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl;

public interface ByProjectKeyCategoriesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCategoriesGet, CategoryPagedQueryResponse, CategoryQueryBuilderDsl> {

    @Override
    default CategoryQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.category();
    }
}
