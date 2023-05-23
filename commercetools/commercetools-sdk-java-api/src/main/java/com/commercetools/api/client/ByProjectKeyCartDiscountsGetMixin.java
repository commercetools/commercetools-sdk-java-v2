
package com.commercetools.api.client;

import com.commercetools.api.models.cart_discount.CartDiscountPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl;

public interface ByProjectKeyCartDiscountsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyCartDiscountsGet, CartDiscountPagedQueryResponse, CartDiscountQueryBuilderDsl> {
    default CartDiscountQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.cartDiscount();
    }

}
