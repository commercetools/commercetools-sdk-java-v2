
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSetAssetCustomTypeActionQueryBuilderDsl {
    public ProductSetAssetCustomTypeActionQueryBuilderDsl() {
    }

    public static ProductSetAssetCustomTypeActionQueryBuilderDsl of() {
        return new ProductSetAssetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAssetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSetAssetCustomTypeActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetCustomTypeActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetAssetCustomTypeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetCustomTypeActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAssetCustomTypeActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSetAssetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ProductSetAssetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSetAssetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ProductSetAssetCustomTypeActionQueryBuilderDsl::of);
    }

}
