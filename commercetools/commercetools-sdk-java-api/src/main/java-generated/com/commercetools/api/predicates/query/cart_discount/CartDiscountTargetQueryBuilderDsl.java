
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountTargetQueryBuilderDsl {
    public CartDiscountTargetQueryBuilderDsl() {
    }

    public static CartDiscountTargetQueryBuilderDsl of() {
        return new CartDiscountTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountTargetQueryBuilderDsl::of));
    }
}
