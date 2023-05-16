
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewStateTransitionMessageQueryBuilderDsl {
    public ReviewStateTransitionMessageQueryBuilderDsl() {
    }

    public static ReviewStateTransitionMessageQueryBuilderDsl of() {
        return new ReviewStateTransitionMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ReviewStateTransitionMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ReviewStateTransitionMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewStateTransitionMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ReviewStateTransitionMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessageQueryBuilderDsl> oldState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ReviewStateTransitionMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessageQueryBuilderDsl> newState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("newState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ReviewStateTransitionMessageQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> oldIncludedInStatistics() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldIncludedInStatistics")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> newIncludedInStatistics() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newIncludedInStatistics")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewStateTransitionMessageQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("target"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewStateTransitionMessageQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ReviewStateTransitionMessageQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, ReviewStateTransitionMessageQueryBuilderDsl::of));
    }

}
