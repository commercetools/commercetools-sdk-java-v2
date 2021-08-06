
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomObjectsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomObjectsGet get() {
        return new ByProjectKeyCustomObjectsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomObjectsPost post(
            com.commercetools.api.models.custom_object.CustomObjectDraft customObjectDraft) {
        return new ByProjectKeyCustomObjectsPost(apiHttpClient, projectKey, customObjectDraft);
    }

    public ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder withContainerAndKey(String container, String key) {
        return new ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder(apiHttpClient, projectKey, container, key);
    }

    public ByProjectKeyCustomObjectsByContainerRequestBuilder withContainer(String container) {
        return new ByProjectKeyCustomObjectsByContainerRequestBuilder(apiHttpClient, projectKey, container);
    }
}
