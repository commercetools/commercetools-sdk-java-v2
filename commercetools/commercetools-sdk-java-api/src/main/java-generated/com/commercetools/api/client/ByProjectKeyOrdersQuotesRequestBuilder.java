
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersQuotesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyOrdersQuotesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrdersQuotesPost post(
            com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft) {
        return new ByProjectKeyOrdersQuotesPost(apiHttpClient, projectKey, orderFromQuoteDraft);
    }

    public ByProjectKeyOrdersQuotesPostString post(final String orderFromQuoteDraft) {
        return new ByProjectKeyOrdersQuotesPostString(apiHttpClient, projectKey, orderFromQuoteDraft);
    }

    public ByProjectKeyOrdersQuotesPost post(
            UnaryOperator<com.commercetools.api.models.order.OrderFromQuoteDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderFromQuoteDraftBuilder.of()).build());
    }

}
