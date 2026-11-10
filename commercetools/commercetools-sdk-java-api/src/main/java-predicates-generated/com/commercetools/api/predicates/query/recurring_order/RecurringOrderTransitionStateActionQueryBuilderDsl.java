
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderTransitionStateActionQueryBuilderDsl {
    public RecurringOrderTransitionStateActionQueryBuilderDsl() {
    }

    public static RecurringOrderTransitionStateActionQueryBuilderDsl of() {
        return new RecurringOrderTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderTransitionStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderTransitionStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            RecurringOrderTransitionStateActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<RecurringOrderTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderTransitionStateActionQueryBuilderDsl::of));
    }

}
