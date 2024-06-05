
package com.commercetools.api.client;

import com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.custom_object.CustomObjectExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl;

public interface ByProjectKeyCustomObjectsByContainerGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCustomObjectsByContainerGet, CustomObjectPagedQueryResponse, CustomObjectQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyCustomObjectsByContainerGet, CustomObjectExpansionBuilderDsl> {

    @Override
    default CustomObjectExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.customObject();
    }

    @Override
    default CustomObjectQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.customObject();
    }
}
