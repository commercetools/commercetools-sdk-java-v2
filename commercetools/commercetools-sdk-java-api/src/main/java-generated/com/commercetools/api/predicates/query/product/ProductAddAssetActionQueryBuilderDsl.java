
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductAddAssetActionQueryBuilderDsl {
    public ProductAddAssetActionQueryBuilderDsl() {
    }

    public static ProductAddAssetActionQueryBuilderDsl of() {
        return new ProductAddAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAddAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductAddAssetActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductAddAssetActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductAddAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductAddAssetActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductAddAssetActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductAddAssetActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductAddAssetActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAddAssetActionQueryBuilderDsl> asset(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("asset"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            ProductAddAssetActionQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductAddAssetActionQueryBuilderDsl> position() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("position")),
            p -> new CombinationQueryPredicate<>(p, ProductAddAssetActionQueryBuilderDsl::of));
    }
}
