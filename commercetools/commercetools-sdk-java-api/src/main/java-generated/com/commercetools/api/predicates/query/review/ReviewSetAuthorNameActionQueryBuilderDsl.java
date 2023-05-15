
package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

public class ReviewSetAuthorNameActionQueryBuilderDsl {
    public ReviewSetAuthorNameActionQueryBuilderDsl() {
    }

    public static ReviewSetAuthorNameActionQueryBuilderDsl of() {
        return new ReviewSetAuthorNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetAuthorNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetAuthorNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewSetAuthorNameActionQueryBuilderDsl> authorName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authorName")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetAuthorNameActionQueryBuilderDsl::of));
    }
}
