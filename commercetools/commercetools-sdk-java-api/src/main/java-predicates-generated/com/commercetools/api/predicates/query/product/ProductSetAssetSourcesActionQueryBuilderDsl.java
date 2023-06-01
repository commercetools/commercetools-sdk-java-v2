package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetAssetSourcesActionQueryBuilderDsl  {
    public ProductSetAssetSourcesActionQueryBuilderDsl() {
    }

    public static ProductSetAssetSourcesActionQueryBuilderDsl of() {
        return new ProductSetAssetSourcesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAssetSourcesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetSourcesActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSetAssetSourcesActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetSourcesActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetSourcesActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetSourcesActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetAssetSourcesActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetSourcesActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetSourcesActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetSourcesActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetSourcesActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetSourcesActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSetAssetSourcesActionQueryBuilderDsl> sources(
        Function<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("sources"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl.of())),
            ProductSetAssetSourcesActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductSetAssetSourcesActionQueryBuilderDsl> sources() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sources")),
                p -> new CombinationQueryPredicate<>(p, ProductSetAssetSourcesActionQueryBuilderDsl::of));
    }
    
}
