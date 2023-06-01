package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductDiscountMatchQueryQueryBuilderDsl  {
    public ProductDiscountMatchQueryQueryBuilderDsl() {
    }

    public static ProductDiscountMatchQueryQueryBuilderDsl of() {
        return new ProductDiscountMatchQueryQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountMatchQueryQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountMatchQueryQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductDiscountMatchQueryQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountMatchQueryQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductDiscountMatchQueryQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountMatchQueryQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductDiscountMatchQueryQueryBuilderDsl> price(
        Function<com.commercetools.api.predicates.query.common.QueryPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.QueryPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("price"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.QueryPriceQueryBuilderDsl.of())),
            ProductDiscountMatchQueryQueryBuilderDsl::of);
    }
    
    
}
