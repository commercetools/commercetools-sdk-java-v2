
package com.commercetools.history.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyByResourceTypeRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String resourceType;

    public ByProjectKeyByResourceTypeRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String resourceType) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.resourceType = resourceType;
    }

    public ByProjectKeyByResourceTypeGet get() {
        return new ByProjectKeyByResourceTypeGet(apiHttpClient, projectKey, resourceType);
    }

    public ByProjectKeyByResourceTypeByIDRequestBuilder withIDValue(String ID) {
        return new ByProjectKeyByResourceTypeByIDRequestBuilder(apiHttpClient, projectKey, resourceType, ID);
    }
}
