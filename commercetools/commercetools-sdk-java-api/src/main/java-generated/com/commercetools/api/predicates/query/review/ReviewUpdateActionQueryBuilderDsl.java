
package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

public class ReviewUpdateActionQueryBuilderDsl {
    public ReviewUpdateActionQueryBuilderDsl() {
    }

    public static ReviewUpdateActionQueryBuilderDsl of() {
        return new ReviewUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewUpdateActionQueryBuilderDsl::of));
    }
}
