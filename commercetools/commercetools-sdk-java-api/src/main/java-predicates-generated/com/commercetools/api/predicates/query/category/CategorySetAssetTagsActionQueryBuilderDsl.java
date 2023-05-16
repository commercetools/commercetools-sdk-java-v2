
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategorySetAssetTagsActionQueryBuilderDsl {
    public CategorySetAssetTagsActionQueryBuilderDsl() {
    }

    public static CategorySetAssetTagsActionQueryBuilderDsl of() {
        return new CategorySetAssetTagsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetAssetTagsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetTagsActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetTagsActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetTagsActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CategorySetAssetTagsActionQueryBuilderDsl> tags() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tags")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetTagsActionQueryBuilderDsl::of));
    }

}
