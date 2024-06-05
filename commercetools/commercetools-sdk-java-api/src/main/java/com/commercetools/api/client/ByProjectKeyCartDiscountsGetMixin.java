
package com.commercetools.api.client;

import com.commercetools.api.models.cart_discount.CartDiscountPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.cart_discount.CartDiscountExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl;

public interface ByProjectKeyCartDiscountsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCartDiscountsGet, CartDiscountPagedQueryResponse, CartDiscountQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyCartDiscountsGet, CartDiscountExpansionBuilderDsl> {

    @Override
    default CartDiscountExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.cartDiscount();
    }

    @Override
    default CartDiscountQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.cartDiscount();
    }

}
