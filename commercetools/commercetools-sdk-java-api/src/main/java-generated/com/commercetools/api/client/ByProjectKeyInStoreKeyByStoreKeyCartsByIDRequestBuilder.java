
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost post(com.commercetools.api.models.cart.CartUpdate cartUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost(apiHttpClient, projectKey, storeKey, ID, cartUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDPostString post(final String cartUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            cartUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost post(
            UnaryOperator<com.commercetools.api.models.cart.CartUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.CartUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
