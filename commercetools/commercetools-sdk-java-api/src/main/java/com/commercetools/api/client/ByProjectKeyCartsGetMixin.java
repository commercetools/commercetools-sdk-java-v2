
package com.commercetools.api.client;

import com.commercetools.api.models.cart.CartPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.cart.CartExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl;

public interface ByProjectKeyCartsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyCartsGet, CartPagedQueryResponse, CartQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyCartsGet, CartExpansionBuilderDsl> {

    @Override
    default CartExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.cart();
    }

    @Override
    default CartQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.cart();
    }
}
