
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderDeletedMessagePayloadQueryBuilderDsl {
    public RecurringOrderDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderDeletedMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderDeletedMessagePayloadQueryBuilderDsl> recurringOrder(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("recurringOrder"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl.of())),
            RecurringOrderDeletedMessagePayloadQueryBuilderDsl::of);
    }

}
