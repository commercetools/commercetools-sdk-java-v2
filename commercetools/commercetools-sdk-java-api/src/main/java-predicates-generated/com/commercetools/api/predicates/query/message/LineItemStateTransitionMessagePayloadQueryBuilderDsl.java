
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class LineItemStateTransitionMessagePayloadQueryBuilderDsl {
    public LineItemStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static LineItemStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new LineItemStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LineItemStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemStateTransitionMessagePayloadQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemStateTransitionMessagePayloadQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<LineItemStateTransitionMessagePayloadQueryBuilderDsl> transitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transitionDate")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemStateTransitionMessagePayloadQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessagePayloadQueryBuilderDsl> fromState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fromState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            LineItemStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessagePayloadQueryBuilderDsl> toState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            LineItemStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

}
