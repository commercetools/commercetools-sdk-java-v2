package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DiscountedLineItemPriceForQuantityQueryBuilderDsl  {
    public DiscountedLineItemPriceForQuantityQueryBuilderDsl() {
    }

    public static DiscountedLineItemPriceForQuantityQueryBuilderDsl of() {
        return new DiscountedLineItemPriceForQuantityQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<DiscountedLineItemPriceForQuantityQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, DiscountedLineItemPriceForQuantityQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DiscountedLineItemPriceForQuantityQueryBuilderDsl> discountedPrice(
        Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discountedPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceQueryBuilderDsl.of())),
            DiscountedLineItemPriceForQuantityQueryBuilderDsl::of);
    }
    
    
}
