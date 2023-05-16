
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountShippingCostTargetQueryBuilderDsl {
    public CartDiscountShippingCostTargetQueryBuilderDsl() {
    }

    public static CartDiscountShippingCostTargetQueryBuilderDsl of() {
        return new CartDiscountShippingCostTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountShippingCostTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountShippingCostTargetQueryBuilderDsl::of));
    }

}
