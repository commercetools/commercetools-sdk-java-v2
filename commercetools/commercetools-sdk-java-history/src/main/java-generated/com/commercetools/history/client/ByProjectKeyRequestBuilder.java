
package com.commercetools.history.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyGet get() {
        return new ByProjectKeyGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyByResourceTypeRequestBuilder withResourceTypeValue(String resourceType) {
        return new ByProjectKeyByResourceTypeRequestBuilder(apiHttpClient, projectKey, resourceType);
    }
}
