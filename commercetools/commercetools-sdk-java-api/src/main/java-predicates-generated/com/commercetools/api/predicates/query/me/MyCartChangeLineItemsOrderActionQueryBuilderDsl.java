
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartChangeLineItemsOrderActionQueryBuilderDsl {
    public MyCartChangeLineItemsOrderActionQueryBuilderDsl() {
    }

    public static MyCartChangeLineItemsOrderActionQueryBuilderDsl of() {
        return new MyCartChangeLineItemsOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartChangeLineItemsOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemsOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MyCartChangeLineItemsOrderActionQueryBuilderDsl> lineItemOrder() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemOrder")),
            p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemsOrderActionQueryBuilderDsl::of));
    }

}
