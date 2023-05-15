
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetAnonymousIdActionQueryBuilderDsl {
    public ShoppingListSetAnonymousIdActionQueryBuilderDsl() {
    }

    public static ShoppingListSetAnonymousIdActionQueryBuilderDsl of() {
        return new ShoppingListSetAnonymousIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetAnonymousIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetAnonymousIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListSetAnonymousIdActionQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetAnonymousIdActionQueryBuilderDsl::of));
    }
}
