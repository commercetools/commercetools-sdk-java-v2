
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurrencePoliciesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRecurrencePoliciesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecurrencePoliciesGet get() {
        return new ByProjectKeyRecurrencePoliciesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecurrencePoliciesHead head() {
        return new ByProjectKeyRecurrencePoliciesHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecurrencePoliciesPost post(
            com.commercetools.api.models.recurrence_policy.RecurrencePolicyDraft recurrencePolicyDraft) {
        return new ByProjectKeyRecurrencePoliciesPost(apiHttpClient, projectKey, recurrencePolicyDraft);
    }

    public ByProjectKeyRecurrencePoliciesPostString post(final String recurrencePolicyDraft) {
        return new ByProjectKeyRecurrencePoliciesPostString(apiHttpClient, projectKey, recurrencePolicyDraft);
    }

    public ByProjectKeyRecurrencePoliciesPost post(
            UnaryOperator<com.commercetools.api.models.recurrence_policy.RecurrencePolicyDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyDraftBuilder.of()).build());
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyRecurrencePoliciesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyRecurrencePoliciesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyRecurrencePoliciesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
