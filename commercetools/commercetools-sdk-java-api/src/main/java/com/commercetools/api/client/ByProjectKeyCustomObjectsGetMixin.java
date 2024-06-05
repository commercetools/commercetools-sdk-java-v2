
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.custom_object.CustomObjectExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl;

public interface ByProjectKeyCustomObjectsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCustomObjectsGet, com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse, CustomObjectQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyCustomObjectsGet, CustomObjectExpansionBuilderDsl> {

    @Override
    default CustomObjectExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.customObject();
    }

    @Override
    default CustomObjectQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.customObject();
    }
}
