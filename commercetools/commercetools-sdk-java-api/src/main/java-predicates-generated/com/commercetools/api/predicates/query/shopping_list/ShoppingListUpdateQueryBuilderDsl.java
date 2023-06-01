package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListUpdateQueryBuilderDsl  {
    public ShoppingListUpdateQueryBuilderDsl() {
    }

    public static ShoppingListUpdateQueryBuilderDsl of() {
        return new ShoppingListUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ShoppingListUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shopping_list.ShoppingListUpdateActionQueryBuilderDsl.of())),
            ShoppingListUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ShoppingListUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, ShoppingListUpdateQueryBuilderDsl::of));
    }
    
}
