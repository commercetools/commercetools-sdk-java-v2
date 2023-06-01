package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl  {
    public ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl of() {
        return new ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl::of));
    }
    
}
