
package com.commercetools.api.client;

import com.commercetools.api.models.customer.CustomerPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl;

public interface ByProjectKeyCustomersGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCustomersGet, CustomerPagedQueryResponse, CustomerQueryBuilderDsl> {
    @Override
    default CustomerQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.customer();
    }
}
