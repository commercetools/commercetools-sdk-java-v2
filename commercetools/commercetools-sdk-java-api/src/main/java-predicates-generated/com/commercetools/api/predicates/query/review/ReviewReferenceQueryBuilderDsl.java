package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewReferenceQueryBuilderDsl  {
    public ReviewReferenceQueryBuilderDsl() {
    }

    public static ReviewReferenceQueryBuilderDsl of() {
        return new ReviewReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ReviewReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ReviewReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReviewReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl.of())),
            ReviewReferenceQueryBuilderDsl::of);
    }
    
    
}
