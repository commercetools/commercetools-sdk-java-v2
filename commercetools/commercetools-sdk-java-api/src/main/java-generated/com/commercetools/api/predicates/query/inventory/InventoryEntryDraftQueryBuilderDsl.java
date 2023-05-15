
package com.commercetools.api.predicates.query.inventory;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryDraftQueryBuilderDsl {
    public InventoryEntryDraftQueryBuilderDsl() {
    }

    public static InventoryEntryDraftQueryBuilderDsl of() {
        return new InventoryEntryDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryDraftQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryDraftQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            InventoryEntryDraftQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<InventoryEntryDraftQueryBuilderDsl> quantityOnStock() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantityOnStock")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<InventoryEntryDraftQueryBuilderDsl> restockableInDays() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("restockableInDays")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<InventoryEntryDraftQueryBuilderDsl> expectedDelivery() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expectedDelivery")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            InventoryEntryDraftQueryBuilderDsl::of);
    }

}
