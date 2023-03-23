
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeySubscriptionsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeySubscriptionsByIDGet get() {
        return new ByProjectKeySubscriptionsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeySubscriptionsByIDPost post(
            com.commercetools.api.models.subscription.SubscriptionUpdate subscriptionUpdate) {
        return new ByProjectKeySubscriptionsByIDPost(apiHttpClient, projectKey, ID, subscriptionUpdate);
    }

    public ByProjectKeySubscriptionsByIDPostString post(final String subscriptionUpdate) {
        return new ByProjectKeySubscriptionsByIDPostString(apiHttpClient, projectKey, ID, subscriptionUpdate);
    }

    public ByProjectKeySubscriptionsByIDPost post(
            UnaryOperator<com.commercetools.api.models.subscription.SubscriptionUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.subscription.SubscriptionUpdateBuilder.of()).build());
    }

    public ByProjectKeySubscriptionsByIDDelete delete() {
        return new ByProjectKeySubscriptionsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeySubscriptionsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

    public ByProjectKeySubscriptionsByIDHealthRequestBuilder withIdHealth() {
        return new ByProjectKeySubscriptionsByIDHealthRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
