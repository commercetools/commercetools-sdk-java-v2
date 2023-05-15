
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountedLineItemPriceDraftQueryBuilderDsl {
    public DiscountedLineItemPriceDraftQueryBuilderDsl() {
    }

    public static DiscountedLineItemPriceDraftQueryBuilderDsl of() {
        return new DiscountedLineItemPriceDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountedLineItemPriceDraftQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            DiscountedLineItemPriceDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountedLineItemPriceDraftQueryBuilderDsl> includedDiscounts(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPortionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPortionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("includedDiscounts"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.DiscountedLineItemPortionQueryBuilderDsl.of())),
            DiscountedLineItemPriceDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountedLineItemPriceDraftQueryBuilderDsl> includedDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedDiscounts")),
            p -> new CombinationQueryPredicate<>(p, DiscountedLineItemPriceDraftQueryBuilderDsl::of));
    }
}
