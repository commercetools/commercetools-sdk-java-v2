package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryEntryDeletedMessageQueryBuilderDsl  {
    public InventoryEntryDeletedMessageQueryBuilderDsl() {
    }

    public static InventoryEntryDeletedMessageQueryBuilderDsl of() {
        return new InventoryEntryDeletedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryDeletedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            InventoryEntryDeletedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<InventoryEntryDeletedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            InventoryEntryDeletedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryDeletedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            InventoryEntryDeletedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryDeletedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            InventoryEntryDeletedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<InventoryEntryDeletedMessageQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryDeletedMessageQueryBuilderDsl> supplyChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryDeletedMessageQueryBuilderDsl::of);
    }
    
    
}
