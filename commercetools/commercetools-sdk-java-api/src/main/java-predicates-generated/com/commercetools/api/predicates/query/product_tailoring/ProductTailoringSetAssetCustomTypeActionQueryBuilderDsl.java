
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl {
    public ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl of() {
        return new ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl::of);
    }

}
