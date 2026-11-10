
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class LineItemRecurrenceInfoQueryBuilderDsl {
    public LineItemRecurrenceInfoQueryBuilderDsl() {
    }

    public static LineItemRecurrenceInfoQueryBuilderDsl of() {
        return new LineItemRecurrenceInfoQueryBuilderDsl();
    }

    public CombinationQueryPredicate<LineItemRecurrenceInfoQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl
                            .of())),
            LineItemRecurrenceInfoQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<LineItemRecurrenceInfoQueryBuilderDsl> priceSelectionMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceSelectionMode")),
            p -> new CombinationQueryPredicate<>(p, LineItemRecurrenceInfoQueryBuilderDsl::of));
    }

}
