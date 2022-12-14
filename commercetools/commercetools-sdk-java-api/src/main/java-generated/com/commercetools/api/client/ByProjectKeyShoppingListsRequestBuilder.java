
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShoppingListsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyShoppingListsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyShoppingListsGet get() {
        return new ByProjectKeyShoppingListsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyShoppingListsPost post(
            com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft) {
        return new ByProjectKeyShoppingListsPost(apiHttpClient, projectKey, shoppingListDraft);
    }

    public ByProjectKeyShoppingListsPost post(
            UnaryOperator<com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder.of()).build());
    }

    public ByProjectKeyShoppingListsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyShoppingListsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyShoppingListsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyShoppingListsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyShoppingListsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shopping_list.ShoppingList> shoppingList,
            java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions) {
        return withId(shoppingList.getId())
                .post(builder -> com.commercetools.api.models.shopping_list.ShoppingListUpdate.builder()
                        .version(shoppingList.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyShoppingListsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shopping_list.ShoppingList> shoppingList,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction, com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder>> op) {
        return withId(shoppingList.getId())
                .post(builder -> com.commercetools.api.models.shopping_list.ShoppingListUpdate.builder()
                        .version(shoppingList.getVersion())
                        .actions(op.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction, com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder, ByProjectKeyShoppingListsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shopping_list.ShoppingList> shoppingList) {
        return builder -> withId(shoppingList.getId())
                .post(b -> com.commercetools.api.models.shopping_list.ShoppingListUpdate.builder()
                        .version(shoppingList.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.shopping_list.ShoppingListUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyShoppingListsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shopping_list.ShoppingList> shoppingList) {
        return withId(shoppingList.getId()).delete().withVersion(shoppingList.getVersion());
    }

    public ByProjectKeyShoppingListsPost create(
            com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft) {
        return post(shoppingListDraft);
    }

    public ByProjectKeyShoppingListsPost create(
            UnaryOperator<com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder.of()).build());
    }

}
