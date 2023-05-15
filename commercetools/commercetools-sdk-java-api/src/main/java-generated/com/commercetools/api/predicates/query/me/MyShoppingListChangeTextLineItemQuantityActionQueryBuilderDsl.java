
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl {
    public MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl() {
    }

    public static MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl of() {
        return new MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl::of));
    }
}
