
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionSetChangesActionQueryBuilderDsl {
    public SubscriptionSetChangesActionQueryBuilderDsl() {
    }

    public static SubscriptionSetChangesActionQueryBuilderDsl of() {
        return new SubscriptionSetChangesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionSetChangesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionSetChangesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionSetChangesActionQueryBuilderDsl> changes(
            Function<com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("changes"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.subscription.ChangeSubscriptionQueryBuilderDsl.of())),
            SubscriptionSetChangesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionSetChangesActionQueryBuilderDsl> changes() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("changes")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionSetChangesActionQueryBuilderDsl::of));
    }
}
