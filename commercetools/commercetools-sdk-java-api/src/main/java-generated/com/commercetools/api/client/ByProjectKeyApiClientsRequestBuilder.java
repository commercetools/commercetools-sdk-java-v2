
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApiClientsRequestBuilder implements ByProjectKeyApiClientsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyApiClientsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyApiClientsGet get() {
        return new ByProjectKeyApiClientsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyApiClientsPost post(com.commercetools.api.models.api_client.ApiClientDraft apiClientDraft) {
        return new ByProjectKeyApiClientsPost(apiHttpClient, projectKey, apiClientDraft);
    }

    public ByProjectKeyApiClientsPost post(
            UnaryOperator<com.commercetools.api.models.api_client.ApiClientDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.api_client.ApiClientDraftBuilder.of()).build());
    }

    public ByProjectKeyApiClientsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyApiClientsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
