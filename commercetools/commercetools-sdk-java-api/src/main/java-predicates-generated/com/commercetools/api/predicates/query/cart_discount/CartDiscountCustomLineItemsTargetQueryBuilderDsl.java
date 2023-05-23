
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountCustomLineItemsTargetQueryBuilderDsl {
    public CartDiscountCustomLineItemsTargetQueryBuilderDsl() {
    }

    public static CartDiscountCustomLineItemsTargetQueryBuilderDsl of() {
        return new CartDiscountCustomLineItemsTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountCustomLineItemsTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountCustomLineItemsTargetQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountCustomLineItemsTargetQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountCustomLineItemsTargetQueryBuilderDsl::of));
    }

}
