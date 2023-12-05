
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeShoppingListsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyMeShoppingListsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeShoppingListsByIDGet get() {
        return new ByProjectKeyMeShoppingListsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeShoppingListsByIDHead head() {
        return new ByProjectKeyMeShoppingListsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeShoppingListsByIDPost post(
            com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        return new ByProjectKeyMeShoppingListsByIDPost(apiHttpClient, projectKey, ID, myShoppingListUpdate);
    }

    public ByProjectKeyMeShoppingListsByIDPostString post(final String myShoppingListUpdate) {
        return new ByProjectKeyMeShoppingListsByIDPostString(apiHttpClient, projectKey, ID, myShoppingListUpdate);
    }

    public ByProjectKeyMeShoppingListsByIDPost post(
            UnaryOperator<com.commercetools.api.models.me.MyShoppingListUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyShoppingListUpdateBuilder.of()).build());
    }

    public ByProjectKeyMeShoppingListsByIDDelete delete() {
        return new ByProjectKeyMeShoppingListsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyMeShoppingListsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
