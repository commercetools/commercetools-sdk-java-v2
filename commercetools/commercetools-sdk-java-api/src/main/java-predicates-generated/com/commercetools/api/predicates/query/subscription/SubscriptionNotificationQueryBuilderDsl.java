
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionNotificationQueryBuilderDsl {
    public SubscriptionNotificationQueryBuilderDsl() {
    }

    public static SubscriptionNotificationQueryBuilderDsl of() {
        return new SubscriptionNotificationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionNotificationQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionNotificationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionNotificationQueryBuilderDsl> asDeliveryPayload(
            Function<com.commercetools.api.predicates.query.subscription.DeliveryPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.DeliveryPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.DeliveryPayloadQueryBuilderDsl.of()),
            SubscriptionNotificationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SubscriptionNotificationQueryBuilderDsl> asEvent(
            Function<com.commercetools.api.predicates.query.subscription.EventDeliveryPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.EventDeliveryPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.subscription.EventDeliveryPayloadQueryBuilderDsl.of()),
            SubscriptionNotificationQueryBuilderDsl::of);
    }
}
