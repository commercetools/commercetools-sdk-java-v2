package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryPagedQueryResponseQueryBuilderDsl  {
    public InventoryPagedQueryResponseQueryBuilderDsl() {
    }

    public static InventoryPagedQueryResponseQueryBuilderDsl of() {
        return new InventoryPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<InventoryPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, InventoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, InventoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, InventoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<InventoryPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, InventoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl.of())),
            InventoryPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<InventoryPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, InventoryPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
