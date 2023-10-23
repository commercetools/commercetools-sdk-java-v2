
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeOrdersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersHead(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost post(
            com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost(apiHttpClient, projectKey, storeKey,
            myOrderFromCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPostString post(final String myOrderFromCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersPostString(apiHttpClient, projectKey, storeKey,
            myOrderFromCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost post(
            UnaryOperator<com.commercetools.api.models.me.MyOrderFromCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyOrderFromCartDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }

}
