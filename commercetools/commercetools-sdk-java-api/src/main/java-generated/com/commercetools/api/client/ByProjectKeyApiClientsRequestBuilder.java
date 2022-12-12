
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyApiClientsRequestBuilder {

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

    public ByProjectKeyApiClientsByIDDelete delete(
            com.commercetools.api.models.Identifiable<com.commercetools.api.models.api_client.ApiClient> apiClient) {
        return withId(apiClient.getId()).delete();
    }

    public ByProjectKeyApiClientsPost create(com.commercetools.api.models.api_client.ApiClientDraft apiClientDraft) {
        return post(apiClientDraft);
    }

    public ByProjectKeyApiClientsPost create(
            UnaryOperator<com.commercetools.api.models.api_client.ApiClientDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.api_client.ApiClientDraftBuilder.of()).build());
    }

}
