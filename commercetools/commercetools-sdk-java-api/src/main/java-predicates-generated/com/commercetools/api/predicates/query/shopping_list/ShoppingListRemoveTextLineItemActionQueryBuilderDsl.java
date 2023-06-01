package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListRemoveTextLineItemActionQueryBuilderDsl  {
    public ShoppingListRemoveTextLineItemActionQueryBuilderDsl() {
    }

    public static ShoppingListRemoveTextLineItemActionQueryBuilderDsl of() {
        return new ShoppingListRemoveTextLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListRemoveTextLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListRemoveTextLineItemActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListRemoveTextLineItemActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListRemoveTextLineItemActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ShoppingListRemoveTextLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListRemoveTextLineItemActionQueryBuilderDsl::of));
    }
    
}
