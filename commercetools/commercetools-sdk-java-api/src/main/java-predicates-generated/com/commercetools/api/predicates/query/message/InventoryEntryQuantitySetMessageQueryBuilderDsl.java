package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryEntryQuantitySetMessageQueryBuilderDsl  {
    public InventoryEntryQuantitySetMessageQueryBuilderDsl() {
    }

    public static InventoryEntryQuantitySetMessageQueryBuilderDsl of() {
        return new InventoryEntryQuantitySetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryQuantitySetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            InventoryEntryQuantitySetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<InventoryEntryQuantitySetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            InventoryEntryQuantitySetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryQuantitySetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            InventoryEntryQuantitySetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryQuantitySetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            InventoryEntryQuantitySetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> oldQuantityOnStock() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuantityOnStock")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> newQuantityOnStock() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newQuantityOnStock")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> oldAvailableQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldAvailableQuantity")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryQuantitySetMessageQueryBuilderDsl> newAvailableQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newAvailableQuantity")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQuantitySetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryQuantitySetMessageQueryBuilderDsl> supplyChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryQuantitySetMessageQueryBuilderDsl::of);
    }
    
    
}
