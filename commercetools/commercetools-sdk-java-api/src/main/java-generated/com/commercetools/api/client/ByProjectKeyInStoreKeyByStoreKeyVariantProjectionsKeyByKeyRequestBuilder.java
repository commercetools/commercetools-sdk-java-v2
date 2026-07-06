
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsKeyByKeyGet(apiHttpClient, projectKey, storeKey,
            key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsKeyByKeyHead(apiHttpClient, projectKey, storeKey,
            key);
    }

}
