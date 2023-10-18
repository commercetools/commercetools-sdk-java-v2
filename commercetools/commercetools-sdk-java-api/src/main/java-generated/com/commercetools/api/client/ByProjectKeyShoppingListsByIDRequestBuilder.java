
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShoppingListsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyShoppingListsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyShoppingListsByIDGet get() {
        return new ByProjectKeyShoppingListsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyShoppingListsByIDHead head() {
        return new ByProjectKeyShoppingListsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyShoppingListsByIDPost post(
            com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        return new ByProjectKeyShoppingListsByIDPost(apiHttpClient, projectKey, ID, shoppingListUpdate);
    }

    public ByProjectKeyShoppingListsByIDPostString post(final String shoppingListUpdate) {
        return new ByProjectKeyShoppingListsByIDPostString(apiHttpClient, projectKey, ID, shoppingListUpdate);
    }

    public ByProjectKeyShoppingListsByIDPost post(
            UnaryOperator<com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder.of()).build());
    }

    public ByProjectKeyShoppingListsByIDDelete delete() {
        return new ByProjectKeyShoppingListsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyShoppingListsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
