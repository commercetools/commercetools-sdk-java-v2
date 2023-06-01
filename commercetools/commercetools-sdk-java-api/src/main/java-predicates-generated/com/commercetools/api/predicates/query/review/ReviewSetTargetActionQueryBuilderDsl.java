package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewSetTargetActionQueryBuilderDsl  {
    public ReviewSetTargetActionQueryBuilderDsl() {
    }

    public static ReviewSetTargetActionQueryBuilderDsl of() {
        return new ReviewSetTargetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetTargetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetTargetActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewSetTargetActionQueryBuilderDsl> target() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("target")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetTargetActionQueryBuilderDsl::of));
    }
    
}
