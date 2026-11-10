
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringRemoveAssetActionQueryBuilderDsl {
    public ProductTailoringRemoveAssetActionQueryBuilderDsl() {
    }

    public static ProductTailoringRemoveAssetActionQueryBuilderDsl of() {
        return new ProductTailoringRemoveAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveAssetActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringRemoveAssetActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveAssetActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveAssetActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringRemoveAssetActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveAssetActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveAssetActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveAssetActionQueryBuilderDsl::of));
    }

}
