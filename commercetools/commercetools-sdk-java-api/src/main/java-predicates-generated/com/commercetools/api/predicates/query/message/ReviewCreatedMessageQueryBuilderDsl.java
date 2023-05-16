
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewCreatedMessageQueryBuilderDsl {
    public ReviewCreatedMessageQueryBuilderDsl() {
    }

    public static ReviewCreatedMessageQueryBuilderDsl of() {
        return new ReviewCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReviewCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReviewCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ReviewCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ReviewCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReviewCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReviewCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReviewCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ReviewCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewCreatedMessageQueryBuilderDsl> review(
            Function<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("review"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl.of())),
            ReviewCreatedMessageQueryBuilderDsl::of);
    }

}
