
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringAddAssetActionQueryBuilderDsl {
    public ProductTailoringAddAssetActionQueryBuilderDsl() {
    }

    public static ProductTailoringAddAssetActionQueryBuilderDsl of() {
        return new ProductTailoringAddAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringAddAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddAssetActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringAddAssetActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringAddAssetActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddAssetActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringAddAssetActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddAssetActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringAddAssetActionQueryBuilderDsl> asset(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("asset"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            ProductTailoringAddAssetActionQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductTailoringAddAssetActionQueryBuilderDsl> position() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("position")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddAssetActionQueryBuilderDsl::of));
    }

}
