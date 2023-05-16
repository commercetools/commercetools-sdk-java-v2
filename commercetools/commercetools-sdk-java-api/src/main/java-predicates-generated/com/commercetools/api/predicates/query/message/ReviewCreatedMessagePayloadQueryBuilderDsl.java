
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewCreatedMessagePayloadQueryBuilderDsl {
    public ReviewCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static ReviewCreatedMessagePayloadQueryBuilderDsl of() {
        return new ReviewCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewCreatedMessagePayloadQueryBuilderDsl> review(
            Function<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("review"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl.of())),
            ReviewCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
