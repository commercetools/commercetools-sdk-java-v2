
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShoppingListsRequestBuilder implements ByProjectKeyShoppingListsRequestBuilderMixin {

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

    public ByProjectKeyShoppingListsPostString post(final String shoppingListDraft) {
        return new ByProjectKeyShoppingListsPostString(apiHttpClient, projectKey, shoppingListDraft);
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

}
