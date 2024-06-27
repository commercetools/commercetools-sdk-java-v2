
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringChangeAssetOrderActionQueryBuilderDsl {
    public ProductTailoringChangeAssetOrderActionQueryBuilderDsl() {
    }

    public static ProductTailoringChangeAssetOrderActionQueryBuilderDsl of() {
        return new ProductTailoringChangeAssetOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringChangeAssetOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetOrderActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringChangeAssetOrderActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetOrderActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringChangeAssetOrderActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetOrderActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringChangeAssetOrderActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductTailoringChangeAssetOrderActionQueryBuilderDsl> assetOrder() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetOrder")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetOrderActionQueryBuilderDsl::of));
    }

}
