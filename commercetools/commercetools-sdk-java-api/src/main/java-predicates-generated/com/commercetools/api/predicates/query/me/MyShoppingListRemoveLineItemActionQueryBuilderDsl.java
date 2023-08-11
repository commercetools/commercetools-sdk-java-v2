
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListRemoveLineItemActionQueryBuilderDsl {
    public MyShoppingListRemoveLineItemActionQueryBuilderDsl() {
    }

    public static MyShoppingListRemoveLineItemActionQueryBuilderDsl of() {
        return new MyShoppingListRemoveLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListRemoveLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListRemoveLineItemActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListRemoveLineItemActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyShoppingListRemoveLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveLineItemActionQueryBuilderDsl::of));
    }

}
