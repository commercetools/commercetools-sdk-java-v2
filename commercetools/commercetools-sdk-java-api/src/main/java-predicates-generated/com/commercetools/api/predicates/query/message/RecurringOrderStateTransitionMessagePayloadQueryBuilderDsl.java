
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl {
    public RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl> oldState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

}
