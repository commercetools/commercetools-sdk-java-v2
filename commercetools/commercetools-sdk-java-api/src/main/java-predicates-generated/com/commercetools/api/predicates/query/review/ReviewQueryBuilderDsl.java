
package com.commercetools.api.predicates.query.review;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewQueryBuilderDsl {
    public ReviewQueryBuilderDsl() {
    }

    public static ReviewQueryBuilderDsl of() {
        return new ReviewQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReviewQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReviewQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ReviewQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ReviewQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ReviewQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewQueryBuilderDsl> uniquenessValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("uniquenessValue")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewQueryBuilderDsl> authorName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authorName")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReviewQueryBuilderDsl> text() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("text")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("target"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReviewQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ReviewQueryBuilderDsl> includedInStatistics() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedInStatistics")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReviewQueryBuilderDsl> rating() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rating")),
            p -> new CombinationQueryPredicate<>(p, ReviewQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ReviewQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            ReviewQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ReviewQueryBuilderDsl::of);
    }

}
