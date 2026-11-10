
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderReferenceQueryBuilderDsl {
    public RecurringOrderReferenceQueryBuilderDsl() {
    }

    public static RecurringOrderReferenceQueryBuilderDsl of() {
        return new RecurringOrderReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl.of())),
            RecurringOrderReferenceQueryBuilderDsl::of);
    }

}
