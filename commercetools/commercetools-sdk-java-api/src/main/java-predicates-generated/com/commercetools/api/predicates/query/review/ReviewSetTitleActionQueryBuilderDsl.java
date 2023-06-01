package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewSetTitleActionQueryBuilderDsl  {
    public ReviewSetTitleActionQueryBuilderDsl() {
    }

    public static ReviewSetTitleActionQueryBuilderDsl of() {
        return new ReviewSetTitleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetTitleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetTitleActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewSetTitleActionQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetTitleActionQueryBuilderDsl::of));
    }
    
}
