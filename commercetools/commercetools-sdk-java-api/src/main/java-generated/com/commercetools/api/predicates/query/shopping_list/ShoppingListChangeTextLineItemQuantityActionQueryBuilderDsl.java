
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl {
    public ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl() {
    }

    public static ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl of() {
        return new ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl::of));
    }
}
