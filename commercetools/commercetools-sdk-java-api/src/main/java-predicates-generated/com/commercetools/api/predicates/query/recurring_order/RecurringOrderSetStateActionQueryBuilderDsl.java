
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetStateActionQueryBuilderDsl {
    public RecurringOrderSetStateActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetStateActionQueryBuilderDsl of() {
        return new RecurringOrderSetStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderSetStateActionQueryBuilderDsl> recurringOrderState(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderStateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderStateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurringOrderState"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.RecurringOrderStateDraftQueryBuilderDsl
                            .of())),
            RecurringOrderSetStateActionQueryBuilderDsl::of);
    }

}
