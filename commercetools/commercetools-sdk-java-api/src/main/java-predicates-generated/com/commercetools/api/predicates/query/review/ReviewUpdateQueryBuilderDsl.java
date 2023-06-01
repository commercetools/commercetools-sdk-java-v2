package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewUpdateQueryBuilderDsl  {
    public ReviewUpdateQueryBuilderDsl() {
    }

    public static ReviewUpdateQueryBuilderDsl of() {
        return new ReviewUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ReviewUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ReviewUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReviewUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.review.ReviewUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.review.ReviewUpdateActionQueryBuilderDsl.of())),
            ReviewUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ReviewUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, ReviewUpdateQueryBuilderDsl::of));
    }
    
}
