
package com.commercetools.api.client;

import com.commercetools.api.models.api_client.ApiClientPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.api_client.ApiClientQueryBuilderDsl;

public interface ByProjectKeyApiClientsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyApiClientsGet, ApiClientPagedQueryResponse, ApiClientQueryBuilderDsl> {
    @Override
    default ApiClientQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.apiClient();
    }
}
