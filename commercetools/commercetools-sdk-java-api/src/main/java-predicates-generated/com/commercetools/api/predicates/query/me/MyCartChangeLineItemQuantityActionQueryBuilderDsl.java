
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartChangeLineItemQuantityActionQueryBuilderDsl {
    public MyCartChangeLineItemQuantityActionQueryBuilderDsl() {
    }

    public static MyCartChangeLineItemQuantityActionQueryBuilderDsl of() {
        return new MyCartChangeLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartChangeLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartChangeLineItemQuantityActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartChangeLineItemQuantityActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyCartChangeLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

}
