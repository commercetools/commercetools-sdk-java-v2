
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewStateTransitionMessagePayloadQueryBuilderDsl {
    public ReviewStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static ReviewStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new ReviewStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessagePayloadQueryBuilderDsl> oldState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ReviewStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessagePayloadQueryBuilderDsl> newState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("newState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ReviewStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ReviewStateTransitionMessagePayloadQueryBuilderDsl> oldIncludedInStatistics() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldIncludedInStatistics")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ReviewStateTransitionMessagePayloadQueryBuilderDsl> newIncludedInStatistics() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newIncludedInStatistics")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessagePayloadQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("target"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ReviewStateTransitionMessagePayloadQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
}
