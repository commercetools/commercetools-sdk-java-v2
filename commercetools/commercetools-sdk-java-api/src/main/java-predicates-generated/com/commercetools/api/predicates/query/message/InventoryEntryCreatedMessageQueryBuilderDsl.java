
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryCreatedMessageQueryBuilderDsl {
    public InventoryEntryCreatedMessageQueryBuilderDsl() {
    }

    public static InventoryEntryCreatedMessageQueryBuilderDsl of() {
        return new InventoryEntryCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntryCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntryCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            InventoryEntryCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<InventoryEntryCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            InventoryEntryCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            InventoryEntryCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            InventoryEntryCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<InventoryEntryCreatedMessageQueryBuilderDsl> inventoryEntry(
            Function<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("inventoryEntry"))
                .inner(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl.of())),
            InventoryEntryCreatedMessageQueryBuilderDsl::of);
    }

}
