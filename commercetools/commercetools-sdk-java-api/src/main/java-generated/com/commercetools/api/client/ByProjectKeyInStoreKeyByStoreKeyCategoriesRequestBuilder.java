
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCategoriesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesHead(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost post(
            com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesPost(apiHttpClient, projectKey, storeKey, categoryDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPostString post(final String categoryDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesPostString(apiHttpClient, projectKey, storeKey,
            categoryDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesPost post(
            UnaryOperator<com.commercetools.api.models.category.CategoryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesKeyByKeyRequestBuilder(apiHttpClient, projectKey, storeKey,
            key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyCategoriesByIDRequestBuilder(apiHttpClient, projectKey, storeKey,
            ID);
    }

}
