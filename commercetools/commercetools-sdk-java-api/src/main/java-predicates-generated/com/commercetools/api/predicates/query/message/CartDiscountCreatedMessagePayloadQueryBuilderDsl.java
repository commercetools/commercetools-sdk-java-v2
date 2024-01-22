
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountCreatedMessagePayloadQueryBuilderDsl {
    public CartDiscountCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static CartDiscountCreatedMessagePayloadQueryBuilderDsl of() {
        return new CartDiscountCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountCreatedMessagePayloadQueryBuilderDsl> cartDiscount(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cartDiscount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl.of())),
            CartDiscountCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
