
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyOrdersRequestBuilder {

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

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder withOrderNumber(
            String orderNumber) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder(apiHttpClient,
            projectKey, storeKey, orderNumber);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }
}
