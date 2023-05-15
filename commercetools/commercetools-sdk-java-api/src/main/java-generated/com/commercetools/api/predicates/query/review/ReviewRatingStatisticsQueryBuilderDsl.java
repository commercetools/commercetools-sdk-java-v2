
package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

public class ReviewRatingStatisticsQueryBuilderDsl {
    public ReviewRatingStatisticsQueryBuilderDsl() {
    }

    public static ReviewRatingStatisticsQueryBuilderDsl of() {
        return new ReviewRatingStatisticsQueryBuilderDsl();
    }

    public DoubleComparisonPredicateBuilder<ReviewRatingStatisticsQueryBuilderDsl> averageRating() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("averageRating")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingStatisticsQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ReviewRatingStatisticsQueryBuilderDsl> highestRating() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("highestRating")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingStatisticsQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<ReviewRatingStatisticsQueryBuilderDsl> lowestRating() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lowestRating")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingStatisticsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewRatingStatisticsQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingStatisticsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewRatingStatisticsQueryBuilderDsl> ratingsDistribution() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("ratingsDistribution")),
            p -> new CombinationQueryPredicate<>(p, ReviewRatingStatisticsQueryBuilderDsl::of));
    }
}
