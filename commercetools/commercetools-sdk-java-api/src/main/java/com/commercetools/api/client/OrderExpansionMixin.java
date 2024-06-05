
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.order.OrderExpansionBuilderDsl;

public interface OrderExpansionMixin<T extends ExpandableRequest<T, OrderExpansionBuilderDsl>>
        extends ExpandableRequest<T, OrderExpansionBuilderDsl> {
    @Override
    default OrderExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.order();
    }
}
