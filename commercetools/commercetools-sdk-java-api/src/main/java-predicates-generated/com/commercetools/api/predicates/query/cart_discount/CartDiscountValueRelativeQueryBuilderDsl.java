
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueRelativeQueryBuilderDsl {
    public CartDiscountValueRelativeQueryBuilderDsl() {
    }

    public static CartDiscountValueRelativeQueryBuilderDsl of() {
        return new CartDiscountValueRelativeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueRelativeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueRelativeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartDiscountValueRelativeQueryBuilderDsl> permyriad() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permyriad")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueRelativeQueryBuilderDsl::of));
    }

}
