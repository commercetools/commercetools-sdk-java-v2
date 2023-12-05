
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String orderNumber;

    public ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String orderNumber) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.orderNumber = orderNumber;
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberGet get() {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClient, projectKey, orderNumber);
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberHead head() {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberHead(apiHttpClient, projectKey, orderNumber);
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost post(
            com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClient, projectKey, orderNumber, orderUpdate);
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPostString post(final String orderUpdate) {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberPostString(apiHttpClient, projectKey, orderNumber,
            orderUpdate);
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberPost post(
            UnaryOperator<com.commercetools.api.models.order.OrderUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderUpdateBuilder.of()).build());
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberDelete delete() {
        return new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClient, projectKey, orderNumber);
    }

    public <TValue> ByProjectKeyOrdersOrderNumberByOrderNumberDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
