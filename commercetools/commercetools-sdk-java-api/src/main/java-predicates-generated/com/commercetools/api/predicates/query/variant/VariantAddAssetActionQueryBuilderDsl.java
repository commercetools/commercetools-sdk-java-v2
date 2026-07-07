
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantAddAssetActionQueryBuilderDsl {
    public VariantAddAssetActionQueryBuilderDsl() {
    }

    public static VariantAddAssetActionQueryBuilderDsl of() {
        return new VariantAddAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantAddAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantAddAssetActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantAddAssetActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantAddAssetActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantAddAssetActionQueryBuilderDsl> asset(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("asset"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            VariantAddAssetActionQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<VariantAddAssetActionQueryBuilderDsl> position() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("position")),
            p -> new CombinationQueryPredicate<>(p, VariantAddAssetActionQueryBuilderDsl::of));
    }

}
