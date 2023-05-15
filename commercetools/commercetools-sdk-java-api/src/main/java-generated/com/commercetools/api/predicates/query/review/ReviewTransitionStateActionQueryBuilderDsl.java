
package com.commercetools.api.predicates.query.review;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewTransitionStateActionQueryBuilderDsl {
    public ReviewTransitionStateActionQueryBuilderDsl() {
    }

    public static ReviewTransitionStateActionQueryBuilderDsl of() {
        return new ReviewTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewTransitionStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewTransitionStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            ReviewTransitionStateActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ReviewTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, ReviewTransitionStateActionQueryBuilderDsl::of));
    }
}
