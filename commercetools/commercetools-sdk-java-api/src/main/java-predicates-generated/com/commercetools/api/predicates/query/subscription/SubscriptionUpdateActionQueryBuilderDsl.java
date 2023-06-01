package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class SubscriptionUpdateActionQueryBuilderDsl  {
    public SubscriptionUpdateActionQueryBuilderDsl() {
    }

    public static SubscriptionUpdateActionQueryBuilderDsl of() {
        return new SubscriptionUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, SubscriptionUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<SubscriptionUpdateActionQueryBuilderDsl> asChangeDestination(
        Function<com.commercetools.api.predicates.query.subscription.SubscriptionChangeDestinationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SubscriptionChangeDestinationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.subscription.SubscriptionChangeDestinationActionQueryBuilderDsl.of()),
            SubscriptionUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<SubscriptionUpdateActionQueryBuilderDsl> asSetChanges(
        Function<com.commercetools.api.predicates.query.subscription.SubscriptionSetChangesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SubscriptionSetChangesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.subscription.SubscriptionSetChangesActionQueryBuilderDsl.of()),
            SubscriptionUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<SubscriptionUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.subscription.SubscriptionSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SubscriptionSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.subscription.SubscriptionSetKeyActionQueryBuilderDsl.of()),
            SubscriptionUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<SubscriptionUpdateActionQueryBuilderDsl> asSetMessages(
        Function<com.commercetools.api.predicates.query.subscription.SubscriptionSetMessagesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SubscriptionSetMessagesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.subscription.SubscriptionSetMessagesActionQueryBuilderDsl.of()),
            SubscriptionUpdateActionQueryBuilderDsl::of);
    }
}
