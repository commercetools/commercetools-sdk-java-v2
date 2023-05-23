
package com.commercetools.api.client;

import com.commercetools.api.models.payment.PaymentPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl;

public interface ByProjectKeyPaymentsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyPaymentsGet, PaymentPagedQueryResponse, PaymentQueryBuilderDsl> {
    @Override
    default PaymentQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.payment();
    }
}
