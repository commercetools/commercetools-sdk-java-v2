package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryEntryUpdateActionQueryBuilderDsl  {
    public InventoryEntryUpdateActionQueryBuilderDsl() {
    }

    public static InventoryEntryUpdateActionQueryBuilderDsl of() {
        return new InventoryEntryUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntryUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asAddQuantity(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntryAddQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryAddQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryAddQuantityActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asChangeQuantity(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntryChangeQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryChangeQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryChangeQuantityActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asRemoveQuantity(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntryRemoveQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryRemoveQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryRemoveQuantityActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntrySetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntrySetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntrySetCustomFieldActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntrySetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntrySetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntrySetCustomTypeActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asSetExpectedDelivery(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntrySetExpectedDeliveryActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntrySetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntrySetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntrySetKeyActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asSetRestockableInDays(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntrySetRestockableInDaysActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntrySetRestockableInDaysActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntrySetRestockableInDaysActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<InventoryEntryUpdateActionQueryBuilderDsl> asSetSupplyChannel(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntrySetSupplyChannelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntrySetSupplyChannelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntrySetSupplyChannelActionQueryBuilderDsl.of()),
            InventoryEntryUpdateActionQueryBuilderDsl::of);
    }
}
