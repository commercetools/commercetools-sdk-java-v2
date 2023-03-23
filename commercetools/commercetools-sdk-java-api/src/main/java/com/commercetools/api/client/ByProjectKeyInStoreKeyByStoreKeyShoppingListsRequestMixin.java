
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListUpdate;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder;

public interface ByProjectKeyInStoreKeyByStoreKeyShoppingListsRequestMixin {
    ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost post(
            com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft);

    ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost update(Versioned<ShoppingList> shoppingList,
            List<ShoppingListUpdateAction> actions) {
        return withId(shoppingList.getId())
                .post(builder -> ShoppingListUpdate.builder().version(shoppingList.getVersion()).actions(actions));
    }

    public default ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost update(Versioned<ShoppingList> shoppingList,
            UnaryOperator<UpdateActionBuilder<ShoppingListUpdateAction, ShoppingListUpdateActionBuilder>> op) {
        return withId(shoppingList.getId()).post(builder -> ShoppingListUpdate.builder()
                .version(shoppingList.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ShoppingListUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ShoppingListUpdateAction, ShoppingListUpdateActionBuilder, ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost> update(
            Versioned<ShoppingList> shoppingList) {
        return builder -> withId(shoppingList.getId()).post(b -> ShoppingListUpdate.builder()
                .version(shoppingList.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ShoppingListUpdateActionBuilder::of)).actions));
    }
}
