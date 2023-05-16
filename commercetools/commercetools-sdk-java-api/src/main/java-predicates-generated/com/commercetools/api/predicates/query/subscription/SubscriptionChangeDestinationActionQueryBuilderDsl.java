
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionChangeDestinationActionQueryBuilderDsl {
    public SubscriptionChangeDestinationActionQueryBuilderDsl() {
    }

    public static SubscriptionChangeDestinationActionQueryBuilderDsl of() {
        return new SubscriptionChangeDestinationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionChangeDestinationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionChangeDestinationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionChangeDestinationActionQueryBuilderDsl> destination(
            Function<com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("destination"))
                .inner(fn.apply(com.commercetools.api.predicates.query.subscription.DestinationQueryBuilderDsl.of())),
            SubscriptionChangeDestinationActionQueryBuilderDsl::of);
    }

}
