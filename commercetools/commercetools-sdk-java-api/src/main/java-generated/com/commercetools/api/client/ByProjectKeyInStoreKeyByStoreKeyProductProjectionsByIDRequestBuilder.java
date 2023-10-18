
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductProjectionsByIDHead(apiHttpClient, projectKey, storeKey, ID);
    }

}
