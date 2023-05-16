
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetKeyActionQueryBuilderDsl {
    public ShoppingListSetKeyActionQueryBuilderDsl() {
    }

    public static ShoppingListSetKeyActionQueryBuilderDsl of() {
        return new ShoppingListSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetKeyActionQueryBuilderDsl::of));
    }

}
