
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsByContainerRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String container;

    public ByProjectKeyCustomObjectsByContainerRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String container) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.container = container;
    }

    public ByProjectKeyCustomObjectsByContainerGet get() {
        return new ByProjectKeyCustomObjectsByContainerGet(apiHttpClient, projectKey, container);
    }

}
