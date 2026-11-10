
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringOrdersKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyRecurringOrdersKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyRecurringOrdersKeyByKeyGet get() {
        return new ByProjectKeyRecurringOrdersKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyRecurringOrdersKeyByKeyHead head() {
        return new ByProjectKeyRecurringOrdersKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyRecurringOrdersKeyByKeyPost post(
            com.commercetools.api.models.recurring_order.RecurringOrderUpdate recurringOrderUpdate) {
        return new ByProjectKeyRecurringOrdersKeyByKeyPost(apiHttpClient, projectKey, key, recurringOrderUpdate);
    }

    public ByProjectKeyRecurringOrdersKeyByKeyPostString post(final String recurringOrderUpdate) {
        return new ByProjectKeyRecurringOrdersKeyByKeyPostString(apiHttpClient, projectKey, key, recurringOrderUpdate);
    }

    public ByProjectKeyRecurringOrdersKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.recurring_order.RecurringOrderUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.recurring_order.RecurringOrderUpdateBuilder.of()).build());
    }

    public ByProjectKeyRecurringOrdersKeyByKeyDelete delete() {
        return new ByProjectKeyRecurringOrdersKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyRecurringOrdersKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
