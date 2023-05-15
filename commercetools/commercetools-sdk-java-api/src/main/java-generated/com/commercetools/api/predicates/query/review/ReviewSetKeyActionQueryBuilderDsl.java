
package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

public class ReviewSetKeyActionQueryBuilderDsl {
    public ReviewSetKeyActionQueryBuilderDsl() {
    }

    public static ReviewSetKeyActionQueryBuilderDsl of() {
        return new ReviewSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetKeyActionQueryBuilderDsl::of));
    }
}
