
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl {
    public InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl() {
    }

    public static InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl of() {
        return new InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> newReservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newReservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl> oldReservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldReservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p,
                InventoryEntryReservationExpirationInMinutesSetMessageQueryBuilderDsl::of));
    }

}
