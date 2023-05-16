
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetAssetTagsActionQueryBuilderDsl {
    public ProductSetAssetTagsActionQueryBuilderDsl() {
    }

    public static ProductSetAssetTagsActionQueryBuilderDsl of() {
        return new ProductSetAssetTagsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAssetTagsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetTagsActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSetAssetTagsActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetTagsActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetTagsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetAssetTagsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetTagsActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetTagsActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductSetAssetTagsActionQueryBuilderDsl> tags() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tags")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetTagsActionQueryBuilderDsl::of));
    }

}
