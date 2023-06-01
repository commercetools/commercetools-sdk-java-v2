package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl  {
    public ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl() {
    }

    public static ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl of() {
        return new ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl> textLineItemOrder() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemOrder")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl::of));
    }
    
}
