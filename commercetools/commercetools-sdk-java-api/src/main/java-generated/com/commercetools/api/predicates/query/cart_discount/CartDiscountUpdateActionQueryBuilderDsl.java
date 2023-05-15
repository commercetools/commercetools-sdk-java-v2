
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountUpdateActionQueryBuilderDsl {
    public CartDiscountUpdateActionQueryBuilderDsl() {
    }

    public static CartDiscountUpdateActionQueryBuilderDsl of() {
        return new CartDiscountUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountUpdateActionQueryBuilderDsl::of));
    }
}
