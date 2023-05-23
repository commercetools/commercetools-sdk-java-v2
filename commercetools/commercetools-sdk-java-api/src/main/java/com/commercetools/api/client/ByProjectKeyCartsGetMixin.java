
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.cart.CartPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl;

public interface ByProjectKeyCartsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyCartsGet, CartPagedQueryResponse, CartQueryBuilderDsl> {
    @Override
    default CartQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.cart();
    }
}
