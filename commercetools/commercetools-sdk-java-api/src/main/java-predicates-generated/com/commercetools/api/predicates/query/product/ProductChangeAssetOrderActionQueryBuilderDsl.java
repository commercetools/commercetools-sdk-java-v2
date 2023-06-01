package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductChangeAssetOrderActionQueryBuilderDsl  {
    public ProductChangeAssetOrderActionQueryBuilderDsl() {
    }

    public static ProductChangeAssetOrderActionQueryBuilderDsl of() {
        return new ProductChangeAssetOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductChangeAssetOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductChangeAssetOrderActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductChangeAssetOrderActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductChangeAssetOrderActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductChangeAssetOrderActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductChangeAssetOrderActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductChangeAssetOrderActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductChangeAssetOrderActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProductChangeAssetOrderActionQueryBuilderDsl> assetOrder() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetOrder")),
        p -> new CombinationQueryPredicate<>(p, ProductChangeAssetOrderActionQueryBuilderDsl::of));
    }
    
}
