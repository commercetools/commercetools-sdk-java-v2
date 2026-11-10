
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderFailedMessageQueryBuilderDsl {
    public RecurringOrderFailedMessageQueryBuilderDsl() {
    }

    public static RecurringOrderFailedMessageQueryBuilderDsl of() {
        return new RecurringOrderFailedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderFailedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            RecurringOrderFailedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderFailedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            RecurringOrderFailedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderFailedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            RecurringOrderFailedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderFailedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            RecurringOrderFailedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> cartId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartId")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> failedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("failedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> failureReason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("failureReason")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> orderScheduledAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderScheduledAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderFailedMessageQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.error.RecurringOrderFailureErrorQueryBuilderDsl.of())),
            RecurringOrderFailedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurringOrderFailedMessageQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailedMessageQueryBuilderDsl::of));
    }

}
