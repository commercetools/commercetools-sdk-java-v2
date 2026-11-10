
package com.commercetools.api.predicates.query.reservation;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReservationQueryBuilderDsl {
    public ReservationQueryBuilderDsl() {
    }

    public static ReservationQueryBuilderDsl of() {
        return new ReservationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReservationQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReservationQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReservationQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReservationQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReservationQueryBuilderDsl> expiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expiresAt")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReservationQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ReservationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReservationQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ReservationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReservationQueryBuilderDsl> inventoryEntry(
            Function<com.commercetools.api.predicates.query.inventory.InventoryEntryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("inventoryEntry"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.inventory.InventoryEntryReferenceQueryBuilderDsl.of())),
            ReservationQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReservationQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReservationQueryBuilderDsl> owner(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("owner"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReservationQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ReservationQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReservationQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, ReservationQueryBuilderDsl::of));
    }

}
