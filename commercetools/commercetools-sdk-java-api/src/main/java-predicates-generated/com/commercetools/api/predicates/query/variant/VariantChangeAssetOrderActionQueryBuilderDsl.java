
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantChangeAssetOrderActionQueryBuilderDsl {
    public VariantChangeAssetOrderActionQueryBuilderDsl() {
    }

    public static VariantChangeAssetOrderActionQueryBuilderDsl of() {
        return new VariantChangeAssetOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantChangeAssetOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantChangeAssetOrderActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantChangeAssetOrderActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantChangeAssetOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<VariantChangeAssetOrderActionQueryBuilderDsl> assetOrder() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetOrder")),
            p -> new CombinationQueryPredicate<>(p, VariantChangeAssetOrderActionQueryBuilderDsl::of));
    }

}
