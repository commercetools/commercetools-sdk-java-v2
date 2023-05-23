
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class InventoryEntryDeletedMessagePayloadQueryBuilderDsl {
    public InventoryEntryDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static InventoryEntryDeletedMessagePayloadQueryBuilderDsl of() {
        return new InventoryEntryDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntryDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InventoryEntryDeletedMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, InventoryEntryDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<InventoryEntryDeletedMessagePayloadQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            InventoryEntryDeletedMessagePayloadQueryBuilderDsl::of);
    }

}
