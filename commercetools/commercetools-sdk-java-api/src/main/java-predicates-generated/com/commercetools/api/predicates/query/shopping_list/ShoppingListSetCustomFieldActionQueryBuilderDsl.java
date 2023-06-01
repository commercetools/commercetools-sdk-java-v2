package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListSetCustomFieldActionQueryBuilderDsl  {
    public ShoppingListSetCustomFieldActionQueryBuilderDsl() {
    }

    public static ShoppingListSetCustomFieldActionQueryBuilderDsl of() {
        return new ShoppingListSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
