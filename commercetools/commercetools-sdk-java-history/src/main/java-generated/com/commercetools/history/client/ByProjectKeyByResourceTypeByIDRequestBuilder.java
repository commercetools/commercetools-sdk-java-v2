
package com.commercetools.history.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyByResourceTypeByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String resourceType;
    private final String ID;

    public ByProjectKeyByResourceTypeByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String resourceType, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.resourceType = resourceType;
        this.ID = ID;
    }

    public ByProjectKeyByResourceTypeByIDGet get() {
        return new ByProjectKeyByResourceTypeByIDGet(apiHttpClient, projectKey, resourceType, ID);
    }

}
