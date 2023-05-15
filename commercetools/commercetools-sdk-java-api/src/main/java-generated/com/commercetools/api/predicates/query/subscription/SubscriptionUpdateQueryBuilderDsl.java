
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionUpdateQueryBuilderDsl {
    public SubscriptionUpdateQueryBuilderDsl() {
    }

    public static SubscriptionUpdateQueryBuilderDsl of() {
        return new SubscriptionUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<SubscriptionUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.subscription.SubscriptionUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SubscriptionUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.subscription.SubscriptionUpdateActionQueryBuilderDsl.of())),
            SubscriptionUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionUpdateQueryBuilderDsl::of));
    }
}
