
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyHead(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyPost post(
            com.commercetools.api.models.category.CategoryUpdate categoryUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            categoryUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyPostString post(final String categoryUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyPostString(apiHttpClient, projectKey, storeKey,
            key, categoryUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.category.CategoryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyDelete(apiHttpClient, projectKey, storeKey, key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
