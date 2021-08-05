
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String container;
    private final String key;

    public ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String container, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.container = container;
        this.key = key;
    }

    public ByProjectKeyCustomObjectsByContainerByKeyGet get() {
        return new ByProjectKeyCustomObjectsByContainerByKeyGet(apiHttpClient, projectKey, container, key);
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete delete() {
        return new ByProjectKeyCustomObjectsByContainerByKeyDelete(apiHttpClient, projectKey, container, key);
    }

}
