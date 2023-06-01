package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductRemoveAssetActionQueryBuilderDsl  {
    public ProductRemoveAssetActionQueryBuilderDsl() {
    }

    public static ProductRemoveAssetActionQueryBuilderDsl of() {
        return new ProductRemoveAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemoveAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveAssetActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductRemoveAssetActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveAssetActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductRemoveAssetActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveAssetActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductRemoveAssetActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveAssetActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductRemoveAssetActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveAssetActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductRemoveAssetActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveAssetActionQueryBuilderDsl::of));
    }
    
}
