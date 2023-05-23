
package com.commercetools.api.client;

import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl;

public interface ByProjectKeyOrdersGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyOrdersGet, com.commercetools.api.models.order.OrderPagedQueryResponse, OrderQueryBuilderDsl> {

    default ByProjectKeyOrdersGet byCustomerId(final String customerId) {
        return withWhere("customerId = :customerId", "customerId", customerId);
    }

    default ByProjectKeyOrdersGet byCustomerEmail(final String customerEmail) {
        return withWhere("customerEmail = :customerEmail", "customerEmail", customerEmail);
    }

    @Override
    default OrderQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.order();
    }
}
