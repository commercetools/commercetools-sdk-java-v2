
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantSetAssetKeyActionQueryBuilderDsl {
    public VariantSetAssetKeyActionQueryBuilderDsl() {
    }

    public static VariantSetAssetKeyActionQueryBuilderDsl of() {
        return new VariantSetAssetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAssetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetKeyActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAssetKeyActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetKeyActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetKeyActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetKeyActionQueryBuilderDsl::of));
    }

}
