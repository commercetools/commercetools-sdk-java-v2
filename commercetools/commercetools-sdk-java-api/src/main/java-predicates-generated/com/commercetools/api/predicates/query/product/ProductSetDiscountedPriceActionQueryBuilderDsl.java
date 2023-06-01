package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetDiscountedPriceActionQueryBuilderDsl  {
    public ProductSetDiscountedPriceActionQueryBuilderDsl() {
    }

    public static ProductSetDiscountedPriceActionQueryBuilderDsl of() {
        return new ProductSetDiscountedPriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetDiscountedPriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetDiscountedPriceActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetDiscountedPriceActionQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetDiscountedPriceActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetDiscountedPriceActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetDiscountedPriceActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSetDiscountedPriceActionQueryBuilderDsl> discounted(
        Function<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discounted"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl.of())),
            ProductSetDiscountedPriceActionQueryBuilderDsl::of);
    }
    
    
}
