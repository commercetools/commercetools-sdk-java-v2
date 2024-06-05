
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.shopping_list.ShoppingListExpansionBuilderDsl;

public interface ShoppingListExpansionMixin<T extends ExpandableRequest<T, ShoppingListExpansionBuilderDsl>>
        extends ExpandableRequest<T, ShoppingListExpansionBuilderDsl> {
    @Override
    default ShoppingListExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.shoppingList();
    }
}
