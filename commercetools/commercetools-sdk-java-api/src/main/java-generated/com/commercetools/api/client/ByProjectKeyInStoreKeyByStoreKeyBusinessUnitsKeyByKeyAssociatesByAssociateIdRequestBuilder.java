
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;
    private final String associateId;

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey, final String key,
            final String associateId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
        this.associateId = associateId;
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet(apiHttpClient,
            projectKey, storeKey, key, associateId);
    }

}
