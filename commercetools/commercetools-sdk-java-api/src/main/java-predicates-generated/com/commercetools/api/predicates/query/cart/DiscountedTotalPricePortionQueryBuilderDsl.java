
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountedTotalPricePortionQueryBuilderDsl {
    public DiscountedTotalPricePortionQueryBuilderDsl() {
    }

    public static DiscountedTotalPricePortionQueryBuilderDsl of() {
        return new DiscountedTotalPricePortionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountedTotalPricePortionQueryBuilderDsl> discount(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discount"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl.of())),
            DiscountedTotalPricePortionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountedTotalPricePortionQueryBuilderDsl> discountedAmount(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedAmount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            DiscountedTotalPricePortionQueryBuilderDsl::of);
    }

}
