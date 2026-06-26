
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantChangeAssetNameActionQueryBuilderDsl {
    public VariantChangeAssetNameActionQueryBuilderDsl() {
    }

    public static VariantChangeAssetNameActionQueryBuilderDsl of() {
        return new VariantChangeAssetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantChangeAssetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantChangeAssetNameActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantChangeAssetNameActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantChangeAssetNameActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantChangeAssetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantChangeAssetNameActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantChangeAssetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantChangeAssetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            VariantChangeAssetNameActionQueryBuilderDsl::of);
    }

}
