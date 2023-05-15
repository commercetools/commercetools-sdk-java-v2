
package com.commercetools.api.predicates.query.review;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewPagedQueryResponseQueryBuilderDsl {
    public ReviewPagedQueryResponseQueryBuilderDsl() {
    }

    public static ReviewPagedQueryResponseQueryBuilderDsl of() {
        return new ReviewPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ReviewPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ReviewPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ReviewPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ReviewPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ReviewPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl.of())),
            ReviewPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ReviewPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ReviewPagedQueryResponseQueryBuilderDsl::of));
    }
}
