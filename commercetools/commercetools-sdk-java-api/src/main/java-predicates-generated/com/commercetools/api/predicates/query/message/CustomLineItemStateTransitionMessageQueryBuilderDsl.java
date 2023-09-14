
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomLineItemStateTransitionMessageQueryBuilderDsl {
    public CustomLineItemStateTransitionMessageQueryBuilderDsl() {
    }

    public static CustomLineItemStateTransitionMessageQueryBuilderDsl of() {
        return new CustomLineItemStateTransitionMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemStateTransitionMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemStateTransitionMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemStateTransitionMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemStateTransitionMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> transitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transitionDate")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomLineItemStateTransitionMessageQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemStateTransitionMessageQueryBuilderDsl> fromState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fromState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemStateTransitionMessageQueryBuilderDsl> toState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            CustomLineItemStateTransitionMessageQueryBuilderDsl::of);
    }

}
