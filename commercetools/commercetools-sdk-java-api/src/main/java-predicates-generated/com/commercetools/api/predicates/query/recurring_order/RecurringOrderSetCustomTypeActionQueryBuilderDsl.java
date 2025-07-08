
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderSetCustomTypeActionQueryBuilderDsl {
    public RecurringOrderSetCustomTypeActionQueryBuilderDsl() {
    }

    public static RecurringOrderSetCustomTypeActionQueryBuilderDsl of() {
        return new RecurringOrderSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            RecurringOrderSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            RecurringOrderSetCustomTypeActionQueryBuilderDsl::of);
    }

}
