
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListRemoveTextLineItemActionQueryBuilderDsl {
    public MyShoppingListRemoveTextLineItemActionQueryBuilderDsl() {
    }

    public static MyShoppingListRemoveTextLineItemActionQueryBuilderDsl of() {
        return new MyShoppingListRemoveTextLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListRemoveTextLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveTextLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListRemoveTextLineItemActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveTextLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListRemoveTextLineItemActionQueryBuilderDsl> textLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveTextLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyShoppingListRemoveTextLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListRemoveTextLineItemActionQueryBuilderDsl::of));
    }

}
