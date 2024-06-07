
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.order_edit.OrderEditExpansionBuilderDsl;

public interface OrderEditExpansionMixin<T extends ExpandableRequest<T, OrderEditExpansionBuilderDsl>>
        extends ExpandableRequest<T, OrderEditExpansionBuilderDsl> {
    @Override
    default OrderEditExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.orderEdit();
    }
}
