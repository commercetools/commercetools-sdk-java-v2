
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String businessUnitId;
    private final String associateId;

    public ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String businessUnitId,
            final String associateId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.businessUnitId = businessUnitId;
        this.associateId = associateId;
    }

    public ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet get() {
        return new ByProjectKeyBusinessUnitsByBusinessUnitIdAssociatesByAssociateIdGet(apiHttpClient, projectKey,
            businessUnitId, associateId);
    }

}
