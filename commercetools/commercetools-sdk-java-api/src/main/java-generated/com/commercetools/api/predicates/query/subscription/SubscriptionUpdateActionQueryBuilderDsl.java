
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class SubscriptionUpdateActionQueryBuilderDsl {
    public SubscriptionUpdateActionQueryBuilderDsl() {
    }

    public static SubscriptionUpdateActionQueryBuilderDsl of() {
        return new SubscriptionUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionUpdateActionQueryBuilderDsl::of));
    }
}
