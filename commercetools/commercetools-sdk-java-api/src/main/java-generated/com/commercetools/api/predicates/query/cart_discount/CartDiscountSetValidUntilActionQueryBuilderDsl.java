
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountSetValidUntilActionQueryBuilderDsl {
    public CartDiscountSetValidUntilActionQueryBuilderDsl() {
    }

    public static CartDiscountSetValidUntilActionQueryBuilderDsl of() {
        return new CartDiscountSetValidUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetValidUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetValidUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartDiscountSetValidUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetValidUntilActionQueryBuilderDsl::of));
    }
}
