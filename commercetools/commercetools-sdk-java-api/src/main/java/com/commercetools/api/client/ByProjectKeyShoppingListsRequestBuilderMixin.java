
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListDraft;
import com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder;
import com.commercetools.api.models.shopping_list.ShoppingListUpdate;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder;

public interface ByProjectKeyShoppingListsRequestBuilderMixin {
    public ByProjectKeyShoppingListsPost post(ShoppingListDraft shoppingListDraft);

    public ByProjectKeyShoppingListsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyShoppingListsByIDPost update(Versioned<ShoppingList> shoppingList,
            List<ShoppingListUpdateAction> actions) {
        return withId(shoppingList.getId())
                .post(builder -> ShoppingListUpdate.builder().version(shoppingList.getVersion()).actions(actions));
    }

    public default ByProjectKeyShoppingListsByIDPost update(Versioned<ShoppingList> shoppingList,
            UnaryOperator<UpdateActionBuilder<ShoppingListUpdateAction, ShoppingListUpdateActionBuilder>> op) {
        return withId(shoppingList.getId()).post(builder -> ShoppingListUpdate.builder()
                .version(shoppingList.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ShoppingListUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ShoppingListUpdateAction, ShoppingListUpdateActionBuilder, ByProjectKeyShoppingListsByIDPost> update(
            Versioned<ShoppingList> shoppingList) {
        return builder -> withId(shoppingList.getId()).post(b -> ShoppingListUpdate.builder()
                .version(shoppingList.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ShoppingListUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyShoppingListsByIDDelete delete(Versioned<ShoppingList> shoppingList) {
        return withId(shoppingList.getId()).delete().withVersion(shoppingList.getVersion());
    }

    public default ByProjectKeyShoppingListsPost create(ShoppingListDraft shoppingListDraft) {
        return post(shoppingListDraft);
    }

    public default ByProjectKeyShoppingListsPost create(UnaryOperator<ShoppingListDraftBuilder> op) {
        return post(op.apply(ShoppingListDraftBuilder.of()).build());
    }
}
