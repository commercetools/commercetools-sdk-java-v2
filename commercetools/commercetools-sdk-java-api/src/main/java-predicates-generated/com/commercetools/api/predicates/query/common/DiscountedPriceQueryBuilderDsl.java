
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountedPriceQueryBuilderDsl {
    public DiscountedPriceQueryBuilderDsl() {
    }

    public static DiscountedPriceQueryBuilderDsl of() {
        return new DiscountedPriceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountedPriceQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            DiscountedPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountedPriceQueryBuilderDsl> discount(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discount"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl
                            .of())),
            DiscountedPriceQueryBuilderDsl::of);
    }

}
