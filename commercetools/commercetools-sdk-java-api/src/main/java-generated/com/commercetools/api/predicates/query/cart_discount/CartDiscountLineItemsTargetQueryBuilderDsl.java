
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountLineItemsTargetQueryBuilderDsl {
    public CartDiscountLineItemsTargetQueryBuilderDsl() {
    }

    public static CartDiscountLineItemsTargetQueryBuilderDsl of() {
        return new CartDiscountLineItemsTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountLineItemsTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountLineItemsTargetQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountLineItemsTargetQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountLineItemsTargetQueryBuilderDsl::of));
    }
}
