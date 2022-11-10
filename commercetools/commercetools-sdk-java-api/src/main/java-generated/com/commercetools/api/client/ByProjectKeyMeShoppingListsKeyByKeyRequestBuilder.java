
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeShoppingListsKeyByKeyGet get() {
        return new ByProjectKeyMeShoppingListsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeShoppingListsKeyByKeyPost post(
            com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        return new ByProjectKeyMeShoppingListsKeyByKeyPost(apiHttpClient, projectKey, key, myShoppingListUpdate);
    }

    public ByProjectKeyMeShoppingListsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.me.MyShoppingListUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyShoppingListUpdateBuilder.of()).build());
    }

    public ByProjectKeyMeShoppingListsKeyByKeyDelete delete() {
        return new ByProjectKeyMeShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyMeShoppingListsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
