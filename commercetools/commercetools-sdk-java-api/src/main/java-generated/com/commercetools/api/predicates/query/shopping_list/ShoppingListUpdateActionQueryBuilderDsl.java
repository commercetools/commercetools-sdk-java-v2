
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListUpdateActionQueryBuilderDsl {
    public ShoppingListUpdateActionQueryBuilderDsl() {
    }

    public static ShoppingListUpdateActionQueryBuilderDsl of() {
        return new ShoppingListUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListUpdateActionQueryBuilderDsl::of));
    }
}
