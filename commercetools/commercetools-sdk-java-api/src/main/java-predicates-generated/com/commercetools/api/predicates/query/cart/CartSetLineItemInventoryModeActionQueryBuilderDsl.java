
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemInventoryModeActionQueryBuilderDsl {
    public CartSetLineItemInventoryModeActionQueryBuilderDsl() {
    }

    public static CartSetLineItemInventoryModeActionQueryBuilderDsl of() {
        return new CartSetLineItemInventoryModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemInventoryModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemInventoryModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemInventoryModeActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemInventoryModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemInventoryModeActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemInventoryModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemInventoryModeActionQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemInventoryModeActionQueryBuilderDsl::of));
    }

}
