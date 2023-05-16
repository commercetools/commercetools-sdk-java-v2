
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class SubscriptionSetKeyActionQueryBuilderDsl {
    public SubscriptionSetKeyActionQueryBuilderDsl() {
    }

    public static SubscriptionSetKeyActionQueryBuilderDsl of() {
        return new SubscriptionSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SubscriptionSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionSetKeyActionQueryBuilderDsl::of));
    }

}
