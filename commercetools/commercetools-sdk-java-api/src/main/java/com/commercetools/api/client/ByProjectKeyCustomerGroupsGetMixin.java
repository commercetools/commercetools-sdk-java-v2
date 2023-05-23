
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.customer_group.CustomerGroupPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl;

public interface ByProjectKeyCustomerGroupsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCustomerGroupsGet, CustomerGroupPagedQueryResponse, CustomerGroupQueryBuilderDsl> {
    @Override
    default CustomerGroupQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.customerGroup();
    }
}
