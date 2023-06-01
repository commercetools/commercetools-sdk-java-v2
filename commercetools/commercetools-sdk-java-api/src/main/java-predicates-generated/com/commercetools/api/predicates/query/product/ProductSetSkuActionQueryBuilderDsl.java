package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetSkuActionQueryBuilderDsl  {
    public ProductSetSkuActionQueryBuilderDsl() {
    }

    public static ProductSetSkuActionQueryBuilderDsl of() {
        return new ProductSetSkuActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetSkuActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetSkuActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSetSkuActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetSkuActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetSkuActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductSetSkuActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetSkuActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetSkuActionQueryBuilderDsl::of));
    }
    
}
