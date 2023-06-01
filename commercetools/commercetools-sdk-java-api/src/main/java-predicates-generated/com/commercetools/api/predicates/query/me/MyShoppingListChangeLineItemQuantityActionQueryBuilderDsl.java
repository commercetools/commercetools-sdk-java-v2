package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl  {
    public MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl() {
    }

    public static MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl of() {
        return new MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    
}
