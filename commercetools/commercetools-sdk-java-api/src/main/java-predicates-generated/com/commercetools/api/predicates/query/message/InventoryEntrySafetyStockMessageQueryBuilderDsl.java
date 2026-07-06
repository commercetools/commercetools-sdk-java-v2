
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntrySafetyStockMessageQueryBuilderDsl {
    public InventoryEntrySafetyStockMessageQueryBuilderDsl() {
    }

    public static InventoryEntrySafetyStockMessageQueryBuilderDsl of() {
        return new InventoryEntrySafetyStockMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntrySafetyStockMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            InventoryEntrySafetyStockMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<InventoryEntrySafetyStockMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            InventoryEntrySafetyStockMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntrySafetyStockMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            InventoryEntrySafetyStockMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntrySafetyStockMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            InventoryEntrySafetyStockMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntrySafetyStockMessageQueryBuilderDsl> quantityOnStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantityOnStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntrySafetyStockMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntrySafetyStockMessageQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntrySafetyStockMessageQueryBuilderDsl::of);
    }

}
