
package com.commercetools.api.client;

import com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl;

public interface ByProjectKeyShoppingListsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyShoppingListsGet, ShoppingListPagedQueryResponse, ShoppingListQueryBuilderDsl> {

    @Override
    default ShoppingListQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.shoppingList();
    }
}
