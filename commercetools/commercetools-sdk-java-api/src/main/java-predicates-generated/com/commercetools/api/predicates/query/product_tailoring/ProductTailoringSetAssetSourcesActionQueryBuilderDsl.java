
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetAssetSourcesActionQueryBuilderDsl {
    public ProductTailoringSetAssetSourcesActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetAssetSourcesActionQueryBuilderDsl of() {
        return new ProductTailoringSetAssetSourcesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> sources(
            Function<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("sources"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl.of())),
            ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringSetAssetSourcesActionQueryBuilderDsl> sources() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sources")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetSourcesActionQueryBuilderDsl::of));
    }

}
