
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySubscriptionsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeySubscriptionsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeySubscriptionsKeyByKeyGet get() {
        return new ByProjectKeySubscriptionsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeySubscriptionsKeyByKeyHead head() {
        return new ByProjectKeySubscriptionsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeySubscriptionsKeyByKeyPost post(
            com.commercetools.api.models.subscription.SubscriptionUpdate subscriptionUpdate) {
        return new ByProjectKeySubscriptionsKeyByKeyPost(apiHttpClient, projectKey, key, subscriptionUpdate);
    }

    public ByProjectKeySubscriptionsKeyByKeyPostString post(final String subscriptionUpdate) {
        return new ByProjectKeySubscriptionsKeyByKeyPostString(apiHttpClient, projectKey, key, subscriptionUpdate);
    }

    public ByProjectKeySubscriptionsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.subscription.SubscriptionUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.subscription.SubscriptionUpdateBuilder.of()).build());
    }

    public ByProjectKeySubscriptionsKeyByKeyDelete delete() {
        return new ByProjectKeySubscriptionsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeySubscriptionsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
