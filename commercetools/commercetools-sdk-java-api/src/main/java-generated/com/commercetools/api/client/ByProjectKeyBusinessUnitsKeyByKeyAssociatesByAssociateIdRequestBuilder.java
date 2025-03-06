
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    private final String associateId;

    public ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key, final String associateId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
        this.associateId = associateId;
    }

    public ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet get() {
        return new ByProjectKeyBusinessUnitsKeyByKeyAssociatesByAssociateIdGet(apiHttpClient, projectKey, key,
            associateId);
    }

}
