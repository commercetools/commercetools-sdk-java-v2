
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String businessUnitId;
    private final String associateId;

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey,
            final String businessUnitId, final String associateId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.businessUnitId = businessUnitId;
        this.associateId = associateId;
    }

    public ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet(
            apiHttpClient, projectKey, storeKey, businessUnitId, associateId);
    }

}
