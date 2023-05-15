
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl {
    public MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl() {
    }

    public static MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl of() {
        return new MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl> lineItemOrder() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemOrder")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl::of));
    }
}
