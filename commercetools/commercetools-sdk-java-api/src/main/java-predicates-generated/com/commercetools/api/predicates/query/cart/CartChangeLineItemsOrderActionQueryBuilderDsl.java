
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartChangeLineItemsOrderActionQueryBuilderDsl {
    public CartChangeLineItemsOrderActionQueryBuilderDsl() {
    }

    public static CartChangeLineItemsOrderActionQueryBuilderDsl of() {
        return new CartChangeLineItemsOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeLineItemsOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartChangeLineItemsOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CartChangeLineItemsOrderActionQueryBuilderDsl> lineItemOrder() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemOrder")),
            p -> new CombinationQueryPredicate<>(p, CartChangeLineItemsOrderActionQueryBuilderDsl::of));
    }

}
