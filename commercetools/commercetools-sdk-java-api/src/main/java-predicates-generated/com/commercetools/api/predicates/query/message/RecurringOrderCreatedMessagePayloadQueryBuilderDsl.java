
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderCreatedMessagePayloadQueryBuilderDsl {
    public RecurringOrderCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderCreatedMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderCreatedMessagePayloadQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl.of())),
            RecurringOrderCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
