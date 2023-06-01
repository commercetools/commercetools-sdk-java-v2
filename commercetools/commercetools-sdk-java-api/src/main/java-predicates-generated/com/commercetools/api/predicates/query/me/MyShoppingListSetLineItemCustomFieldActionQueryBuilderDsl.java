package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl  {
    public MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl of() {
        return new MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    
}
