
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.cart.CartExpansionBuilderDsl;

public interface CartExpansionMixin<T extends ExpandableRequest<T, CartExpansionBuilderDsl>>
        extends ExpandableRequest<T, CartExpansionBuilderDsl> {

    @Override
    default CartExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.cart();
    }

}
