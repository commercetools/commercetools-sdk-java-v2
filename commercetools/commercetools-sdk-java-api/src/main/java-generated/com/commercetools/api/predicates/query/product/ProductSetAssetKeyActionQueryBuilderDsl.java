
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetAssetKeyActionQueryBuilderDsl {
    public ProductSetAssetKeyActionQueryBuilderDsl() {
    }

    public static ProductSetAssetKeyActionQueryBuilderDsl of() {
        return new ProductSetAssetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAssetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetKeyActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSetAssetKeyActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetKeyActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetKeyActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetAssetKeyActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetKeyActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetKeyActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetKeyActionQueryBuilderDsl::of));
    }
}
