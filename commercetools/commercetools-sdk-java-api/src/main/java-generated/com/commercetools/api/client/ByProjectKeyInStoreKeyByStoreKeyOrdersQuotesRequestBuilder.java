
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost post(
            com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost(apiHttpClient, projectKey, storeKey,
            orderFromQuoteDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString post(final String orderFromQuoteDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPostString(apiHttpClient, projectKey, storeKey,
            orderFromQuoteDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersQuotesPost post(
            UnaryOperator<com.commercetools.api.models.order.OrderFromQuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderFromQuoteDraftBuilder.of()).build());
    }

}
