
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyCartsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCartsKeyByKeyGet get() {
        return new ByProjectKeyCartsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCartsKeyByKeyPost post(com.commercetools.api.models.cart.CartUpdate cartUpdate) {
        return new ByProjectKeyCartsKeyByKeyPost(apiHttpClient, projectKey, key, cartUpdate);
    }

    public ByProjectKeyCartsKeyByKeyPostString post(final String cartUpdate) {
        return new ByProjectKeyCartsKeyByKeyPostString(apiHttpClient, projectKey, key, cartUpdate);
    }

    public ByProjectKeyCartsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.cart.CartUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.CartUpdateBuilder.of()).build());
    }

    public ByProjectKeyCartsKeyByKeyDelete delete() {
        return new ByProjectKeyCartsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyCartsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
