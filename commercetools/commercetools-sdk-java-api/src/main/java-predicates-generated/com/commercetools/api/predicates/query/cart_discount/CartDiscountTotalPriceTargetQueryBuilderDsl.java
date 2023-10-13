
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountTotalPriceTargetQueryBuilderDsl {
    public CartDiscountTotalPriceTargetQueryBuilderDsl() {
    }

    public static CartDiscountTotalPriceTargetQueryBuilderDsl of() {
        return new CartDiscountTotalPriceTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountTotalPriceTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountTotalPriceTargetQueryBuilderDsl::of));
    }

}
