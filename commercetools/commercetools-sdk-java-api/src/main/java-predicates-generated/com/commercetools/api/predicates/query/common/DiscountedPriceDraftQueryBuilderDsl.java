package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DiscountedPriceDraftQueryBuilderDsl  {
    public DiscountedPriceDraftQueryBuilderDsl() {
    }

    public static DiscountedPriceDraftQueryBuilderDsl of() {
        return new DiscountedPriceDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountedPriceDraftQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            DiscountedPriceDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<DiscountedPriceDraftQueryBuilderDsl> discount(
        Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discount"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_discount.ProductDiscountReferenceQueryBuilderDsl.of())),
            DiscountedPriceDraftQueryBuilderDsl::of);
    }
    
    
}
