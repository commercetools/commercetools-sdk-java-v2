
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl {
    public RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl of() {
        return new RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl> skipConfigurationInputDraft(
            Function<com.commercetools.api.predicates.query.recurring_order.SkipConfigurationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.SkipConfigurationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("skipConfigurationInputDraft"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.SkipConfigurationDraftQueryBuilderDsl.of())),
            RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl> updatedExpiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updatedExpiresAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl::of));
    }

}
