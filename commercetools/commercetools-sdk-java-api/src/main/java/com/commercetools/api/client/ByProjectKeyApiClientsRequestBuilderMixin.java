
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.api_client.ApiClientDraft;
import com.commercetools.api.models.api_client.ApiClientDraftBuilder;

public interface ByProjectKeyApiClientsRequestBuilderMixin {
    public ByProjectKeyApiClientsPost post(ApiClientDraft apiClientDraft);

    public ByProjectKeyApiClientsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyApiClientsByIDDelete delete(Identifiable<ApiClient> apiClient) {
        return withId(apiClient.getId()).delete();
    }

    public default ByProjectKeyApiClientsPost create(ApiClientDraft apiClientDraft) {
        return post(apiClientDraft);
    }

    public default ByProjectKeyApiClientsPost create(UnaryOperator<ApiClientDraftBuilder> op) {
        return post(op.apply(ApiClientDraftBuilder.of()).build());
    }

}
