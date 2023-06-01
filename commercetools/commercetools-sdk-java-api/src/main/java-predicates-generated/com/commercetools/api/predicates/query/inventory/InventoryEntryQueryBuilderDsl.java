package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryEntryQueryBuilderDsl  {
    public InventoryEntryQueryBuilderDsl() {
    }

    public static InventoryEntryQueryBuilderDsl of() {
        return new InventoryEntryQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            InventoryEntryQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<InventoryEntryQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            InventoryEntryQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryQueryBuilderDsl> supplyChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> quantityOnStock() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantityOnStock")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> availableQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("availableQuantity")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> restockableInDays() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("restockableInDays")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<InventoryEntryQueryBuilderDsl> expectedDelivery() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expectedDelivery")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntryQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            InventoryEntryQueryBuilderDsl::of);
    }
    
    
}
