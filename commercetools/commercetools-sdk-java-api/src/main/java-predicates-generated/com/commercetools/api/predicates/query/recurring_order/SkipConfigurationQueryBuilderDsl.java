
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SkipConfigurationQueryBuilderDsl {
    public SkipConfigurationQueryBuilderDsl() {
    }

    public static SkipConfigurationQueryBuilderDsl of() {
        return new SkipConfigurationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SkipConfigurationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, SkipConfigurationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SkipConfigurationQueryBuilderDsl> asCounter(
            Function<com.commercetools.api.predicates.query.recurring_order.CounterQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.CounterQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.CounterQueryBuilderDsl.of()),
            SkipConfigurationQueryBuilderDsl::of);
    }
}
