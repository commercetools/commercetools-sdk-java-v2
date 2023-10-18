
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyHead(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyPost post(
            com.commercetools.api.models.customer.CustomerUpdate customerUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            customerUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyPostString post(final String customerUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyPostString(apiHttpClient, projectKey, storeKey, key,
            customerUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(apiHttpClient, projectKey, storeKey, key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
