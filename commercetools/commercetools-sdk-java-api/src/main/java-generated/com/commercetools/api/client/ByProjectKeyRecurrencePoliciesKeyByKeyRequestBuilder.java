
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurrencePoliciesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyRecurrencePoliciesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyGet get() {
        return new ByProjectKeyRecurrencePoliciesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyHead head() {
        return new ByProjectKeyRecurrencePoliciesKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyPost post(
            com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdate recurrencePolicyUpdate) {
        return new ByProjectKeyRecurrencePoliciesKeyByKeyPost(apiHttpClient, projectKey, key, recurrencePolicyUpdate);
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyPostString post(final String recurrencePolicyUpdate) {
        return new ByProjectKeyRecurrencePoliciesKeyByKeyPostString(apiHttpClient, projectKey, key,
            recurrencePolicyUpdate);
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateBuilder> op) {
        return post(
            op.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateBuilder.of()).build());
    }

    public ByProjectKeyRecurrencePoliciesKeyByKeyDelete delete() {
        return new ByProjectKeyRecurrencePoliciesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyRecurrencePoliciesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
