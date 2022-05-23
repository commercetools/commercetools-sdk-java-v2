
package com.commercetools.api.client;

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

    public ByProjectKeyCartsKeyByKeyDelete delete() {
        return new ByProjectKeyCartsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
