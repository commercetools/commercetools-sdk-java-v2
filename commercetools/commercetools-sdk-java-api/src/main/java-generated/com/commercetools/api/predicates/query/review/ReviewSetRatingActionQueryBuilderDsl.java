
package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

public class ReviewSetRatingActionQueryBuilderDsl {
    public ReviewSetRatingActionQueryBuilderDsl() {
    }

    public static ReviewSetRatingActionQueryBuilderDsl of() {
        return new ReviewSetRatingActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetRatingActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetRatingActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewSetRatingActionQueryBuilderDsl> rating() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rating")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetRatingActionQueryBuilderDsl::of));
    }
}
