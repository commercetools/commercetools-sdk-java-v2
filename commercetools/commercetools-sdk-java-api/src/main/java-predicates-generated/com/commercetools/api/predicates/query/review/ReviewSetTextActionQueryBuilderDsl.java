
package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

public class ReviewSetTextActionQueryBuilderDsl {
    public ReviewSetTextActionQueryBuilderDsl() {
    }

    public static ReviewSetTextActionQueryBuilderDsl of() {
        return new ReviewSetTextActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetTextActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetTextActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewSetTextActionQueryBuilderDsl> text() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("text")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetTextActionQueryBuilderDsl::of));
    }

}
