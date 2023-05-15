
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountedLineItemPriceQueryBuilderDsl {
    public DiscountedLineItemPriceQueryBuilderDsl() {
    }

    public static DiscountedLineItemPriceQueryBuilderDsl of() {
        return new DiscountedLineItemPriceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountedLineItemPriceQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            DiscountedLineItemPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountedLineItemPriceQueryBuilderDsl> includedDiscounts(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPortionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPortionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("includedDiscounts"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.DiscountedLineItemPortionQueryBuilderDsl.of())),
            DiscountedLineItemPriceQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountedLineItemPriceQueryBuilderDsl> includedDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedDiscounts")),
            p -> new CombinationQueryPredicate<>(p, DiscountedLineItemPriceQueryBuilderDsl::of));
    }
}
