
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueQueryBuilderDsl {
    public CartDiscountValueQueryBuilderDsl() {
    }

    public static CartDiscountValueQueryBuilderDsl of() {
        return new CartDiscountValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueQueryBuilderDsl::of));
    }
}
