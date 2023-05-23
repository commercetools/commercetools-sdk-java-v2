
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.type.TypePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl;

public interface ByProjectKeyTypesGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyTypesGet, TypePagedQueryResponse, TypeQueryBuilderDsl> {
    @Override
    default TypeQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.type();
    }
}
