
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderExpiresAtSetMessageQueryBuilderDsl {
    public RecurringOrderExpiresAtSetMessageQueryBuilderDsl() {
    }

    public static RecurringOrderExpiresAtSetMessageQueryBuilderDsl of() {
        return new RecurringOrderExpiresAtSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> newExpiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newExpiresAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessageQueryBuilderDsl> oldExpiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldExpiresAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessageQueryBuilderDsl::of));
    }

}
