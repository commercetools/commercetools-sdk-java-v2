
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderUpdateQueryBuilderDsl {
    public RecurringOrderUpdateQueryBuilderDsl() {
    }

    public static RecurringOrderUpdateQueryBuilderDsl of() {
        return new RecurringOrderUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<RecurringOrderUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.RecurringOrderUpdateActionQueryBuilderDsl
                            .of())),
            RecurringOrderUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurringOrderUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderUpdateQueryBuilderDsl::of));
    }

}
