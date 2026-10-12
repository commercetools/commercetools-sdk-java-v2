
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDHead(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDPost post(
            com.commercetools.api.models.category.CategoryUpdate categoryUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDPost(apiHttpClient, projectKey, storeKey, ID,
            categoryUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDPostString post(final String categoryUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            categoryUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDPost post(
            UnaryOperator<com.commercetools.api.models.category.CategoryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
