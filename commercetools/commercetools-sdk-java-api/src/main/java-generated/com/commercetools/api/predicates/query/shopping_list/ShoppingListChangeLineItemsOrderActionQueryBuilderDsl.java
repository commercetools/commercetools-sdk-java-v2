
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListChangeLineItemsOrderActionQueryBuilderDsl {
    public ShoppingListChangeLineItemsOrderActionQueryBuilderDsl() {
    }

    public static ShoppingListChangeLineItemsOrderActionQueryBuilderDsl of() {
        return new ShoppingListChangeLineItemsOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeLineItemsOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeLineItemsOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ShoppingListChangeLineItemsOrderActionQueryBuilderDsl> lineItemOrder() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemOrder")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeLineItemsOrderActionQueryBuilderDsl::of));
    }
}
