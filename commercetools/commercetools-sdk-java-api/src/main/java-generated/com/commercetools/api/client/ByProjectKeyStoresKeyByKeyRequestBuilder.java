
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStoresKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyStoresKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyStoresKeyByKeyGet get() {
        return new ByProjectKeyStoresKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStoresKeyByKeyPost post(com.commercetools.api.models.store.StoreUpdate storeUpdate) {
        return new ByProjectKeyStoresKeyByKeyPost(apiHttpClient, projectKey, key, storeUpdate);
    }

    public ByProjectKeyStoresKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.store.StoreUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.store.StoreUpdateBuilder.of()).build());
    }

    public ByProjectKeyStoresKeyByKeyDelete delete() {
        return new ByProjectKeyStoresKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyStoresKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
