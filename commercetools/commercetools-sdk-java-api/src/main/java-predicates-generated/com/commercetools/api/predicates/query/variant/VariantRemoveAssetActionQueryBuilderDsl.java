
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantRemoveAssetActionQueryBuilderDsl {
    public VariantRemoveAssetActionQueryBuilderDsl() {
    }

    public static VariantRemoveAssetActionQueryBuilderDsl of() {
        return new VariantRemoveAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantRemoveAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveAssetActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantRemoveAssetActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantRemoveAssetActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantRemoveAssetActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveAssetActionQueryBuilderDsl::of));
    }

}
