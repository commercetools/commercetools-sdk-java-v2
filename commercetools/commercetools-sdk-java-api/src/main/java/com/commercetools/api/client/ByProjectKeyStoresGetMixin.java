
package com.commercetools.api.client;

import com.commercetools.api.models.store.StorePagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.store.StoreExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl;

public interface ByProjectKeyStoresGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyStoresGet, StorePagedQueryResponse, StoreQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyStoresGet, StoreExpansionBuilderDsl> {

    @Override
    default StoreExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.store();
    }

    @Override
    default StoreQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.store();
    }
}
