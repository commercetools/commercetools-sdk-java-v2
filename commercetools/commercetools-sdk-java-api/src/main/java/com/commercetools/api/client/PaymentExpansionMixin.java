
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.payment.PaymentExpansionBuilderDsl;

public interface PaymentExpansionMixin<T extends ExpandableRequest<T, PaymentExpansionBuilderDsl>>
        extends ExpandableRequest<T, PaymentExpansionBuilderDsl> {
    @Override
    default PaymentExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.payment();
    }
}
