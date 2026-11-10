
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SkipConfigurationDraftQueryBuilderDsl {
    public SkipConfigurationDraftQueryBuilderDsl() {
    }

    public static SkipConfigurationDraftQueryBuilderDsl of() {
        return new SkipConfigurationDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SkipConfigurationDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, SkipConfigurationDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SkipConfigurationDraftQueryBuilderDsl> asCounter(
            Function<com.commercetools.api.predicates.query.recurring_order.CounterDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.CounterDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.CounterDraftQueryBuilderDsl.of()),
            SkipConfigurationDraftQueryBuilderDsl::of);
    }
}
