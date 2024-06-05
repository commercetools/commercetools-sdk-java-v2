
package com.commercetools.api.client;

import com.commercetools.api.models.customer_group.CustomerGroupPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.customer_group.CustomerGroupExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl;

public interface ByProjectKeyCustomerGroupsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCustomerGroupsGet, CustomerGroupPagedQueryResponse, CustomerGroupQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyCustomerGroupsGet, CustomerGroupExpansionBuilderDsl> {

    @Override
    default CustomerGroupExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.customerGroup();
    }

    @Override
    default CustomerGroupQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.customerGroup();
    }
}
