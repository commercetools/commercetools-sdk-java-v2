package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListSetCustomTypeActionQueryBuilderDsl  {
    public ShoppingListSetCustomTypeActionQueryBuilderDsl() {
    }

    public static ShoppingListSetCustomTypeActionQueryBuilderDsl of() {
        return new ShoppingListSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListSetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ShoppingListSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShoppingListSetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ShoppingListSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
