
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersRequestBuilder implements ByProjectKeyOrdersRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyOrdersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyOrdersGet get() {
        return new ByProjectKeyOrdersGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyOrdersPost post(com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft) {
        return new ByProjectKeyOrdersPost(apiHttpClient, projectKey, orderFromCartDraft);
    }

    public ByProjectKeyOrdersPost post(UnaryOperator<com.commercetools.api.models.order.OrderFromCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderFromCartDraftBuilder.of()).build());
    }

    public ByProjectKeyOrdersImportRequestBuilder importOrder() {
        return new ByProjectKeyOrdersImportRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyOrdersQuotesRequestBuilder orderQuote() {
        return new ByProjectKeyOrdersQuotesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder withOrderNumber(String orderNumber) {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder(apiHttpClient, projectKey, orderNumber);
    }

    public ByProjectKeyOrdersEditsRequestBuilder edits() {
        return new ByProjectKeyOrdersEditsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyOrdersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyOrdersByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyOrdersSearchRequestBuilder search() {
        return new ByProjectKeyOrdersSearchRequestBuilder(apiHttpClient, projectKey);
    }

}
