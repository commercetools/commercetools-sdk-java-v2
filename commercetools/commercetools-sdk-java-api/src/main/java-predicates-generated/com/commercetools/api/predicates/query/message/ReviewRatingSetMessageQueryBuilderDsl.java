package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewRatingSetMessageQueryBuilderDsl  {
    public ReviewRatingSetMessageQueryBuilderDsl() {
    }

    public static ReviewRatingSetMessageQueryBuilderDsl of() {
        return new ReviewRatingSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReviewRatingSetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ReviewRatingSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ReviewRatingSetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ReviewRatingSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReviewRatingSetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewRatingSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReviewRatingSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ReviewRatingSetMessageQueryBuilderDsl::of);
    }
    
    public DoubleComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> oldRating() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldRating")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> newRating() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newRating")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ReviewRatingSetMessageQueryBuilderDsl> includedInStatistics() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedInStatistics")),
        p -> new CombinationQueryPredicate<>(p, ReviewRatingSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReviewRatingSetMessageQueryBuilderDsl> target(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("target"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewRatingSetMessageQueryBuilderDsl::of);
    }
    
    
}
