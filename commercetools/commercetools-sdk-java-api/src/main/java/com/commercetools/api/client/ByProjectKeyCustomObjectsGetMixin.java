
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl;

public interface ByProjectKeyCustomObjectsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCustomObjectsGet, com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse, CustomObjectQueryBuilderDsl> {
    @Override
    default CustomObjectQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.customObject();
    }
}
