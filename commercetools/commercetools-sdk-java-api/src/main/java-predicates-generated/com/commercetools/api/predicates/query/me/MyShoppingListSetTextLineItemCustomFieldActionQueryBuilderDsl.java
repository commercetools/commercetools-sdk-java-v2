package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl  {
    public MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl of() {
        return new MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    
}
