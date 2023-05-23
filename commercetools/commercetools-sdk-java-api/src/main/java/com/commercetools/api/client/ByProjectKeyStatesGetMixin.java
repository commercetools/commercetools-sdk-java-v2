
package com.commercetools.api.client;

import com.commercetools.api.models.state.StatePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.state.StateQueryBuilderDsl;

public interface ByProjectKeyStatesGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyStatesGet, StatePagedQueryResponse, StateQueryBuilderDsl> {
    @Override
    default StateQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.state();
    }
}
