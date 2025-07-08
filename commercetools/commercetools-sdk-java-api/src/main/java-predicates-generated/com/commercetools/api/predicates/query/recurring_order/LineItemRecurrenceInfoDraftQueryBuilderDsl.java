
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class LineItemRecurrenceInfoDraftQueryBuilderDsl {
    public LineItemRecurrenceInfoDraftQueryBuilderDsl() {
    }

    public static LineItemRecurrenceInfoDraftQueryBuilderDsl of() {
        return new LineItemRecurrenceInfoDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<LineItemRecurrenceInfoDraftQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl
                            .of())),
            LineItemRecurrenceInfoDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<LineItemRecurrenceInfoDraftQueryBuilderDsl> priceSelectionMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceSelectionMode")),
            p -> new CombinationQueryPredicate<>(p, LineItemRecurrenceInfoDraftQueryBuilderDsl::of));
    }

}
