
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListSetCustomFieldActionQueryBuilderDsl {
    public MyShoppingListSetCustomFieldActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetCustomFieldActionQueryBuilderDsl of() {
        return new MyShoppingListSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetCustomFieldActionQueryBuilderDsl::of));
    }
}
