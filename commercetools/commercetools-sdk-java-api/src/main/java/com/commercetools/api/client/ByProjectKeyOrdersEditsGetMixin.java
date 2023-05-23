
package com.commercetools.api.client;

import com.commercetools.api.models.order_edit.OrderEditPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl;

public interface ByProjectKeyOrdersEditsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyOrdersEditsGet, OrderEditPagedQueryResponse, OrderEditQueryBuilderDsl> {
    @Override
    default OrderEditQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.orderEdit();
    }
}
