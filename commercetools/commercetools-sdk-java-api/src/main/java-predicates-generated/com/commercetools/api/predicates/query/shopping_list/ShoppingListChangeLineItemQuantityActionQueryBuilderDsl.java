
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListChangeLineItemQuantityActionQueryBuilderDsl {
    public ShoppingListChangeLineItemQuantityActionQueryBuilderDsl() {
    }

    public static ShoppingListChangeLineItemQuantityActionQueryBuilderDsl of() {
        return new ShoppingListChangeLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeLineItemQuantityActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeLineItemQuantityActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListChangeLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

}
