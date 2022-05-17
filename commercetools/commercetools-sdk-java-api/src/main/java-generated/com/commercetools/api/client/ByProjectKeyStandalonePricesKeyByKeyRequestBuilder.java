
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyStandalonePricesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyStandalonePricesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyStandalonePricesKeyByKeyGet get() {
        return new ByProjectKeyStandalonePricesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStandalonePricesKeyByKeyPost post(
            com.commercetools.api.models.standalone_price.StandalonePriceUpdate standalonePriceUpdate) {
        return new ByProjectKeyStandalonePricesKeyByKeyPost(apiHttpClient, projectKey, key, standalonePriceUpdate);
    }

    public ByProjectKeyStandalonePricesKeyByKeyDelete delete() {
        return new ByProjectKeyStandalonePricesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
