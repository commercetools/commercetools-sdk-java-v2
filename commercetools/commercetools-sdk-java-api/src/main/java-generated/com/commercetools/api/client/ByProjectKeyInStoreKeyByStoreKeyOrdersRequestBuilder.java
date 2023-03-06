
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersRequestBuilder
        implements ByProjectKeyInStoreKeyByStoreKeyOrdersRequestMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost post(
            com.commercetools.api.models.order.OrderFromCartDraft orderFromCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClient, projectKey, storeKey, orderFromCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersPost post(
            UnaryOperator<com.commercetools.api.models.order.OrderFromCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderFromCartDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder withOrderNumber(
            String orderNumber) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder(apiHttpClient,
            projectKey, storeKey, orderNumber);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }

}
