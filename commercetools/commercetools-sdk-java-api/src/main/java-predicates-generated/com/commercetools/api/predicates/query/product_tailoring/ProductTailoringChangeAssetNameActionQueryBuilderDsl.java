
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringChangeAssetNameActionQueryBuilderDsl {
    public ProductTailoringChangeAssetNameActionQueryBuilderDsl() {
    }

    public static ProductTailoringChangeAssetNameActionQueryBuilderDsl of() {
        return new ProductTailoringChangeAssetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringChangeAssetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetNameActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringChangeAssetNameActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringChangeAssetNameActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetNameActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringChangeAssetNameActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringChangeAssetNameActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringChangeAssetNameActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringChangeAssetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringChangeAssetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringChangeAssetNameActionQueryBuilderDsl::of);
    }

}
