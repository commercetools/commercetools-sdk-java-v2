
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurrencePoliciesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyRecurrencePoliciesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyRecurrencePoliciesByIDGet get() {
        return new ByProjectKeyRecurrencePoliciesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyRecurrencePoliciesByIDHead head() {
        return new ByProjectKeyRecurrencePoliciesByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyRecurrencePoliciesByIDPost post(
            com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdate recurrencePolicyUpdate) {
        return new ByProjectKeyRecurrencePoliciesByIDPost(apiHttpClient, projectKey, ID, recurrencePolicyUpdate);
    }

    public ByProjectKeyRecurrencePoliciesByIDPostString post(final String recurrencePolicyUpdate) {
        return new ByProjectKeyRecurrencePoliciesByIDPostString(apiHttpClient, projectKey, ID, recurrencePolicyUpdate);
    }

    public ByProjectKeyRecurrencePoliciesByIDPost post(
            UnaryOperator<com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateBuilder> op) {
        return post(
            op.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateBuilder.of()).build());
    }

}
