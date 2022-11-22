
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeShoppingListsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMeShoppingListsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeShoppingListsGet get() {
        return new ByProjectKeyMeShoppingListsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeShoppingListsPost post(
            com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft) {
        return new ByProjectKeyMeShoppingListsPost(apiHttpClient, projectKey, myShoppingListDraft);
    }

    public ByProjectKeyMeShoppingListsPost post(
            UnaryOperator<com.commercetools.api.models.me.MyShoppingListDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyShoppingListDraftBuilder.of()).build());
    }

    public ByProjectKeyMeShoppingListsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMeShoppingListsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
}
