
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountOnTotalPriceQueryBuilderDsl {
    public DiscountOnTotalPriceQueryBuilderDsl() {
    }

    public static DiscountOnTotalPriceQueryBuilderDsl of() {
        return new DiscountOnTotalPriceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountOnTotalPriceQueryBuilderDsl> discountedAmount(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedAmount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            DiscountOnTotalPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountOnTotalPriceQueryBuilderDsl> includedDiscounts(
            Function<com.commercetools.api.predicates.query.cart.DiscountedTotalPricePortionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedTotalPricePortionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("includedDiscounts"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.DiscountedTotalPricePortionQueryBuilderDsl.of())),
            DiscountOnTotalPriceQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountOnTotalPriceQueryBuilderDsl> includedDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedDiscounts")),
            p -> new CombinationQueryPredicate<>(p, DiscountOnTotalPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountOnTotalPriceQueryBuilderDsl> discountedNetAmount(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedNetAmount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            DiscountOnTotalPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountOnTotalPriceQueryBuilderDsl> discountedGrossAmount(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedGrossAmount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            DiscountOnTotalPriceQueryBuilderDsl::of);
    }

}
