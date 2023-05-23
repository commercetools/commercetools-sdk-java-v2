
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductChangeAssetNameActionQueryBuilderDsl {
    public ProductChangeAssetNameActionQueryBuilderDsl() {
    }

    public static ProductChangeAssetNameActionQueryBuilderDsl of() {
        return new ProductChangeAssetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductChangeAssetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeAssetNameActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductChangeAssetNameActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductChangeAssetNameActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeAssetNameActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductChangeAssetNameActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductChangeAssetNameActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductChangeAssetNameActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeAssetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductChangeAssetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductChangeAssetNameActionQueryBuilderDsl::of);
    }

}
