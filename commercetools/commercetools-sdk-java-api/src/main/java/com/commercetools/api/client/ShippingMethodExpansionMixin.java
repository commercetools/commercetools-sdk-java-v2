
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.shipping_method.ShippingMethodExpansionBuilderDsl;

public interface ShippingMethodExpansionMixin<T extends ExpandableRequest<T, ShippingMethodExpansionBuilderDsl>>
        extends ExpandableRequest<T, ShippingMethodExpansionBuilderDsl> {
    @Override
    default ShippingMethodExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.shippingMethod();
    }
}
