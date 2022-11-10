
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeySubscriptionsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeySubscriptionsGet get() {
        return new ByProjectKeySubscriptionsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeySubscriptionsPost post(
            com.commercetools.api.models.subscription.SubscriptionDraft subscriptionDraft) {
        return new ByProjectKeySubscriptionsPost(apiHttpClient, projectKey, subscriptionDraft);
    }

    public ByProjectKeySubscriptionsPost post(
            UnaryOperator<com.commercetools.api.models.subscription.SubscriptionDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.subscription.SubscriptionDraftBuilder.of()).build());
    }

    public ByProjectKeySubscriptionsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeySubscriptionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeySubscriptionsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeySubscriptionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
