
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionSetEventsActionQueryBuilderDsl {
    public SubscriptionSetEventsActionQueryBuilderDsl() {
    }

    public static SubscriptionSetEventsActionQueryBuilderDsl of() {
        return new SubscriptionSetEventsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionSetEventsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionSetEventsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionSetEventsActionQueryBuilderDsl> messages(
            Function<com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("messages"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.EventSubscriptionQueryBuilderDsl.of())),
            SubscriptionSetEventsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionSetEventsActionQueryBuilderDsl> messages() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("messages")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionSetEventsActionQueryBuilderDsl::of));
    }

}
