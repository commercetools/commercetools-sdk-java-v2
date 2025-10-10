
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApplicationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyApplicationsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyApplicationsGet get() {
        return new ByProjectKeyApplicationsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyApplicationsPost post(
            com.commercetools.checkout.models.application.ApplicationDraft applicationDraft) {
        return new ByProjectKeyApplicationsPost(apiHttpClient, projectKey, applicationDraft);
    }

    public ByProjectKeyApplicationsPostString post(final String applicationDraft) {
        return new ByProjectKeyApplicationsPostString(apiHttpClient, projectKey, applicationDraft);
    }

    public ByProjectKeyApplicationsPost post(
            UnaryOperator<com.commercetools.checkout.models.application.ApplicationDraftBuilder> op) {
        return post(op.apply(com.commercetools.checkout.models.application.ApplicationDraftBuilder.of()).build());
    }

    public ByProjectKeyApplicationsByIdRequestBuilder withId(String id) {
        return new ByProjectKeyApplicationsByIdRequestBuilder(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyApplicationsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyApplicationsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

}
