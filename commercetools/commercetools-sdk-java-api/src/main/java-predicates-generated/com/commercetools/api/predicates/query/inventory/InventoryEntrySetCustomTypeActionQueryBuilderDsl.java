package com.commercetools.api.predicates.query.inventory;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InventoryEntrySetCustomTypeActionQueryBuilderDsl  {
    public InventoryEntrySetCustomTypeActionQueryBuilderDsl() {
    }

    public static InventoryEntrySetCustomTypeActionQueryBuilderDsl of() {
        return new InventoryEntrySetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InventoryEntrySetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, InventoryEntrySetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<InventoryEntrySetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            InventoryEntrySetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<InventoryEntrySetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            InventoryEntrySetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
