
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantSetAssetSourcesActionQueryBuilderDsl {
    public VariantSetAssetSourcesActionQueryBuilderDsl() {
    }

    public static VariantSetAssetSourcesActionQueryBuilderDsl of() {
        return new VariantSetAssetSourcesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAssetSourcesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAssetSourcesActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetSourcesActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetSourcesActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetSourcesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSetAssetSourcesActionQueryBuilderDsl> sources(
            Function<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("sources"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl.of())),
            VariantSetAssetSourcesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantSetAssetSourcesActionQueryBuilderDsl> sources() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sources")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetSourcesActionQueryBuilderDsl::of));
    }

}
