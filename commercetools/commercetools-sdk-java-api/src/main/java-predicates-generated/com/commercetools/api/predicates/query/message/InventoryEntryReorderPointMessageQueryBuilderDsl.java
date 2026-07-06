
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryReorderPointMessageQueryBuilderDsl {
    public InventoryEntryReorderPointMessageQueryBuilderDsl() {
    }

    public static InventoryEntryReorderPointMessageQueryBuilderDsl of() {
        return new InventoryEntryReorderPointMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReorderPointMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            InventoryEntryReorderPointMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<InventoryEntryReorderPointMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            InventoryEntryReorderPointMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReorderPointMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            InventoryEntryReorderPointMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReorderPointMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            InventoryEntryReorderPointMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryReorderPointMessageQueryBuilderDsl> quantityOnStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantityOnStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryReorderPointMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryReorderPointMessageQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryReorderPointMessageQueryBuilderDsl::of);
    }

}
