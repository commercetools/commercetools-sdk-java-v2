
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String orderNumber;

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey,
            final String orderNumber) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.orderNumber = orderNumber;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberGet(apiHttpClient, projectKey,
            storeKey, orderNumber);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost post(
            com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClient, projectKey,
            storeKey, orderNumber, orderUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClient, projectKey,
            storeKey, orderNumber);
    }

}
