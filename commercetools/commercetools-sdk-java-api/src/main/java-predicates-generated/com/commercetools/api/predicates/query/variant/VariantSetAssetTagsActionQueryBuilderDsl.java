
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantSetAssetTagsActionQueryBuilderDsl {
    public VariantSetAssetTagsActionQueryBuilderDsl() {
    }

    public static VariantSetAssetTagsActionQueryBuilderDsl of() {
        return new VariantSetAssetTagsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAssetTagsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetTagsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAssetTagsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetTagsActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetTagsActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<VariantSetAssetTagsActionQueryBuilderDsl> tags() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tags")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetTagsActionQueryBuilderDsl::of));
    }

}
