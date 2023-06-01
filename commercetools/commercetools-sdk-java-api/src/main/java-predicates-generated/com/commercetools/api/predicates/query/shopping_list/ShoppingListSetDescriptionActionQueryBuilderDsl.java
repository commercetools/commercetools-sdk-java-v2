package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListSetDescriptionActionQueryBuilderDsl  {
    public ShoppingListSetDescriptionActionQueryBuilderDsl() {
    }

    public static ShoppingListSetDescriptionActionQueryBuilderDsl of() {
        return new ShoppingListSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetDescriptionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListSetDescriptionActionQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListSetDescriptionActionQueryBuilderDsl::of);
    }
    
    
}
