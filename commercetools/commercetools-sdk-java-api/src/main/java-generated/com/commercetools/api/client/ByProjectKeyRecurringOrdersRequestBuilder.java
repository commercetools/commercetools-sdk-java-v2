
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringOrdersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRecurringOrdersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecurringOrdersGet get() {
        return new ByProjectKeyRecurringOrdersGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecurringOrdersHead head() {
        return new ByProjectKeyRecurringOrdersHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecurringOrdersPost post(
            com.commercetools.api.models.recurring_order.RecurringOrderDraft recurringOrderDraft) {
        return new ByProjectKeyRecurringOrdersPost(apiHttpClient, projectKey, recurringOrderDraft);
    }

    public ByProjectKeyRecurringOrdersPostString post(final String recurringOrderDraft) {
        return new ByProjectKeyRecurringOrdersPostString(apiHttpClient, projectKey, recurringOrderDraft);
    }

    public ByProjectKeyRecurringOrdersPost post(
            UnaryOperator<com.commercetools.api.models.recurring_order.RecurringOrderDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.recurring_order.RecurringOrderDraftBuilder.of()).build());
    }

    public ByProjectKeyRecurringOrdersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyRecurringOrdersByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyRecurringOrdersKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyRecurringOrdersKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

}
