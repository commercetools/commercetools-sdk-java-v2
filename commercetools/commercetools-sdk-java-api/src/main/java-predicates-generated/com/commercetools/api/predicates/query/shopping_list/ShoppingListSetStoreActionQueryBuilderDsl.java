package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListSetStoreActionQueryBuilderDsl  {
    public ShoppingListSetStoreActionQueryBuilderDsl() {
    }

    public static ShoppingListSetStoreActionQueryBuilderDsl of() {
        return new ShoppingListSetStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetStoreActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListSetStoreActionQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            ShoppingListSetStoreActionQueryBuilderDsl::of);
    }
    
    
}
