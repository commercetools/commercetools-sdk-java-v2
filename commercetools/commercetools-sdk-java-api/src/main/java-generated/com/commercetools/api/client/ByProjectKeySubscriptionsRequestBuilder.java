
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

    public ByProjectKeySubscriptionsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.subscription.Subscription> subscription,
            java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> actions) {
        return withId(subscription.getId())
                .post(builder -> com.commercetools.api.models.subscription.SubscriptionUpdate.builder()
                        .version(subscription.getVersion())
                        .actions(actions));
    }

    public ByProjectKeySubscriptionsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.subscription.Subscription> subscription,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.subscription.SubscriptionUpdateAction, com.commercetools.api.models.subscription.SubscriptionUpdateActionBuilder>> op) {
        return withId(subscription.getId()).post(builder -> com.commercetools.api.models.subscription.SubscriptionUpdate
                .builder()
                .version(subscription.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.subscription.SubscriptionUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.subscription.SubscriptionUpdateAction, com.commercetools.api.models.subscription.SubscriptionUpdateActionBuilder, ByProjectKeySubscriptionsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.subscription.Subscription> subscription) {
        return builder -> withId(subscription.getId())
                .post(b -> com.commercetools.api.models.subscription.SubscriptionUpdate.builder()
                        .version(subscription.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.subscription.SubscriptionUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeySubscriptionsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.subscription.Subscription> subscription) {
        return withId(subscription.getId()).delete().withVersion(subscription.getVersion());
    }

    public ByProjectKeySubscriptionsPost create(
            com.commercetools.api.models.subscription.SubscriptionDraft subscriptionDraft) {
        return post(subscriptionDraft);
    }

    public ByProjectKeySubscriptionsPost create(
            UnaryOperator<com.commercetools.api.models.subscription.SubscriptionDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.subscription.SubscriptionDraftBuilder.of()).build());
    }

}
