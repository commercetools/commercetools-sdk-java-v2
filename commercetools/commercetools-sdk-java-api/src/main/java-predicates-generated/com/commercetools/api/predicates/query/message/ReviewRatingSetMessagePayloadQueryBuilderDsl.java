
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewRatingSetMessagePayloadQueryBuilderDsl {
    public ReviewRatingSetMessagePayloadQueryBuilderDsl() {
    }

    public static ReviewRatingSetMessagePayloadQueryBuilderDsl of() {
        return new ReviewRatingSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewRatingSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessagePayloadQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ReviewRatingSetMessagePayloadQueryBuilderDsl> oldRating() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldRating")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessagePayloadQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ReviewRatingSetMessagePayloadQueryBuilderDsl> newRating() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newRating")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ReviewRatingSetMessagePayloadQueryBuilderDsl> includedInStatistics() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedInStatistics")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewRatingSetMessagePayloadQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("target"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewRatingSetMessagePayloadQueryBuilderDsl::of);
    }

}
