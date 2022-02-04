
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductSelectionsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyProductSelectionsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductSelectionsKeyByKeyGet get() {
        return new ByProjectKeyProductSelectionsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductSelectionsKeyByKeyPost post(
            com.commercetools.api.models.product_selection.ProductSelectionUpdate productSelectionUpdate) {
        return new ByProjectKeyProductSelectionsKeyByKeyPost(apiHttpClient, projectKey, key, productSelectionUpdate);
    }

    public ByProjectKeyProductSelectionsKeyByKeyDelete delete() {
        return new ByProjectKeyProductSelectionsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductSelectionsKeyByKeyProductsRequestBuilder products() {
        return new ByProjectKeyProductSelectionsKeyByKeyProductsRequestBuilder(apiHttpClient, projectKey, key);
    }
}
