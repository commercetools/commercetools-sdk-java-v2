
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class LineItemStateTransitionMessageQueryBuilderDsl {
    public LineItemStateTransitionMessageQueryBuilderDsl() {
    }

    public static LineItemStateTransitionMessageQueryBuilderDsl of() {
        return new LineItemStateTransitionMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            LineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            LineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            LineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            LineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> transitionDate() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transitionDate")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemStateTransitionMessageQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemStateTransitionMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessageQueryBuilderDsl> fromState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fromState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            LineItemStateTransitionMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemStateTransitionMessageQueryBuilderDsl> toState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            LineItemStateTransitionMessageQueryBuilderDsl::of);
    }

}
