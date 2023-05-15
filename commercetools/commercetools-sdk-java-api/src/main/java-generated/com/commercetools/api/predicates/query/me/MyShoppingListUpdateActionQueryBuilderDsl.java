
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListUpdateActionQueryBuilderDsl {
    public MyShoppingListUpdateActionQueryBuilderDsl() {
    }

    public static MyShoppingListUpdateActionQueryBuilderDsl of() {
        return new MyShoppingListUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListUpdateActionQueryBuilderDsl::of));
    }
}
