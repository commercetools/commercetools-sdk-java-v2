
package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ShoppingListMixin extends Referencable<ShoppingList>, ResourceIdentifiable<ShoppingList> {
    @Override
    public default ShoppingListResourceIdentifier toResourceIdentifier() {
        return ShoppingListResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ShoppingListReference toReference() {
        return ShoppingListReference.builder().id(getId()).build();
    }
}
