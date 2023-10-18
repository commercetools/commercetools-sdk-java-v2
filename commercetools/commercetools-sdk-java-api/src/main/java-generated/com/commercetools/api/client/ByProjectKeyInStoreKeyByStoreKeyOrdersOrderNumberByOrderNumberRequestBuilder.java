
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberHead(apiHttpClient, projectKey,
            storeKey, orderNumber);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost post(
            com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost(apiHttpClient, projectKey,
            storeKey, orderNumber, orderUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPostString post(final String orderUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPostString(apiHttpClient, projectKey,
            storeKey, orderNumber, orderUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberPost post(
            UnaryOperator<com.commercetools.api.models.order.OrderUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClient, projectKey,
            storeKey, orderNumber);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
