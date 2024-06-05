
package com.commercetools.api.client;

import com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.shopping_list.ShoppingListExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl;

public interface ByProjectKeyShoppingListsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyShoppingListsGet, ShoppingListPagedQueryResponse, ShoppingListQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyShoppingListsGet, ShoppingListExpansionBuilderDsl> {

    @Override
    default ShoppingListExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.shoppingList();
    }

    @Override
    default ShoppingListQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.shoppingList();
    }
}
