
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.cart_discount.CartDiscountExpansionBuilderDsl;

public interface CartDiscountExpansionMixin<T extends ExpandableRequest<T, CartDiscountExpansionBuilderDsl>>
        extends ExpandableRequest<T, CartDiscountExpansionBuilderDsl> {

    @Override
    default CartDiscountExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.cartDiscount();
    }
}
