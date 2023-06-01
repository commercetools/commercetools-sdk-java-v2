package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl  {
    public MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl() {
    }

    public static MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl of() {
        return new MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl> textLineItemOrder() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemOrder")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl::of));
    }
    
}
