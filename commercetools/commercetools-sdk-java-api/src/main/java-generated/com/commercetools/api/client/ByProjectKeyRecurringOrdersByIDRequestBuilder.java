
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringOrdersByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyRecurringOrdersByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyRecurringOrdersByIDGet get() {
        return new ByProjectKeyRecurringOrdersByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyRecurringOrdersByIDHead head() {
        return new ByProjectKeyRecurringOrdersByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyRecurringOrdersByIDPost post(
            com.commercetools.api.models.recurring_order.RecurringOrderUpdate recurringOrderUpdate) {
        return new ByProjectKeyRecurringOrdersByIDPost(apiHttpClient, projectKey, ID, recurringOrderUpdate);
    }

    public ByProjectKeyRecurringOrdersByIDPostString post(final String recurringOrderUpdate) {
        return new ByProjectKeyRecurringOrdersByIDPostString(apiHttpClient, projectKey, ID, recurringOrderUpdate);
    }

    public ByProjectKeyRecurringOrdersByIDPost post(
            UnaryOperator<com.commercetools.api.models.recurring_order.RecurringOrderUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.recurring_order.RecurringOrderUpdateBuilder.of()).build());
    }

}
