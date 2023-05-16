
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSetAssetDescriptionActionQueryBuilderDsl {
    public ProductSetAssetDescriptionActionQueryBuilderDsl() {
    }

    public static ProductSetAssetDescriptionActionQueryBuilderDsl of() {
        return new ProductSetAssetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAssetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSetAssetDescriptionActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetDescriptionActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetAssetDescriptionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetDescriptionActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetDescriptionActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSetAssetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSetAssetDescriptionActionQueryBuilderDsl::of);
    }

}
