
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    public ByProjectKeyCustomObjectsHead head() {
        return new ByProjectKeyCustomObjectsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomObjectsPost post(
            com.commercetools.api.models.custom_object.CustomObjectDraft customObjectDraft) {
        return new ByProjectKeyCustomObjectsPost(apiHttpClient, projectKey, customObjectDraft);
    }

    public ByProjectKeyCustomObjectsPostString post(final String customObjectDraft) {
        return new ByProjectKeyCustomObjectsPostString(apiHttpClient, projectKey, customObjectDraft);
    }

    public ByProjectKeyCustomObjectsPost post(
            UnaryOperator<com.commercetools.api.models.custom_object.CustomObjectDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.custom_object.CustomObjectDraftBuilder.of()).build());
    }

    public ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder withContainerAndKey(String container, String key) {
        return new ByProjectKeyCustomObjectsByContainerByKeyRequestBuilder(apiHttpClient, projectKey, container, key);
    }

    public ByProjectKeyCustomObjectsByContainerRequestBuilder withContainer(String container) {
        return new ByProjectKeyCustomObjectsByContainerRequestBuilder(apiHttpClient, projectKey, container);
    }

}
