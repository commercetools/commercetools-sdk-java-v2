
package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

public class ReviewSetLocaleActionQueryBuilderDsl {
    public ReviewSetLocaleActionQueryBuilderDsl() {
    }

    public static ReviewSetLocaleActionQueryBuilderDsl of() {
        return new ReviewSetLocaleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetLocaleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetLocaleActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewSetLocaleActionQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetLocaleActionQueryBuilderDsl::of));
    }
}
