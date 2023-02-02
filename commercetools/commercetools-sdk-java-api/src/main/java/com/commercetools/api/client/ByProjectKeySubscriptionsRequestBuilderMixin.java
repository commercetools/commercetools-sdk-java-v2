
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.subscription.Subscription;
import com.commercetools.api.models.subscription.SubscriptionDraft;
import com.commercetools.api.models.subscription.SubscriptionDraftBuilder;
import com.commercetools.api.models.subscription.SubscriptionUpdate;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionUpdateActionBuilder;

public interface ByProjectKeySubscriptionsRequestBuilderMixin {
    public ByProjectKeySubscriptionsPost post(SubscriptionDraft subscriptionDraft);

    public ByProjectKeySubscriptionsByIDRequestBuilder withId(String ID);

    public default ByProjectKeySubscriptionsByIDPost update(Versioned<Subscription> subscription,
            List<SubscriptionUpdateAction> actions) {
        return withId(subscription.getId())
                .post(builder -> SubscriptionUpdate.builder().version(subscription.getVersion()).actions(actions));
    }

    public default ByProjectKeySubscriptionsByIDPost update(Versioned<Subscription> subscription,
            UnaryOperator<UpdateActionBuilder<SubscriptionUpdateAction, SubscriptionUpdateActionBuilder>> op) {
        return withId(subscription.getId()).post(builder -> SubscriptionUpdate.builder()
                .version(subscription.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(SubscriptionUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<SubscriptionUpdateAction, SubscriptionUpdateActionBuilder, ByProjectKeySubscriptionsByIDPost> update(
            Versioned<Subscription> subscription) {
        return builder -> withId(subscription.getId()).post(b -> SubscriptionUpdate.builder()
                .version(subscription.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(SubscriptionUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeySubscriptionsByIDDelete delete(Versioned<Subscription> subscription) {
        return withId(subscription.getId()).delete().withVersion(subscription.getVersion());
    }

    public default ByProjectKeySubscriptionsPost create(SubscriptionDraft subscriptionDraft) {
        return post(subscriptionDraft);
    }

    public default ByProjectKeySubscriptionsPost create(UnaryOperator<SubscriptionDraftBuilder> op) {
        return post(op.apply(SubscriptionDraftBuilder.of()).build());
    }

}
