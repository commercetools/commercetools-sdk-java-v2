
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountSetValidFromActionQueryBuilderDsl {
    public CartDiscountSetValidFromActionQueryBuilderDsl() {
    }

    public static CartDiscountSetValidFromActionQueryBuilderDsl of() {
        return new CartDiscountSetValidFromActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetValidFromActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetValidFromActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartDiscountSetValidFromActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetValidFromActionQueryBuilderDsl::of));
    }

}
