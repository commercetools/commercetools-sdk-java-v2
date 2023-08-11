
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListRemoveLineItemActionQueryBuilderDsl {
    public ShoppingListRemoveLineItemActionQueryBuilderDsl() {
    }

    public static ShoppingListRemoveLineItemActionQueryBuilderDsl of() {
        return new ShoppingListRemoveLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListRemoveLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListRemoveLineItemActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListRemoveLineItemActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListRemoveLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

}
