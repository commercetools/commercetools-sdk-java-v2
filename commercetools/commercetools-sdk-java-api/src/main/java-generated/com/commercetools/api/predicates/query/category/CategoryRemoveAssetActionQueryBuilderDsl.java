
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategoryRemoveAssetActionQueryBuilderDsl {
    public CategoryRemoveAssetActionQueryBuilderDsl() {
    }

    public static CategoryRemoveAssetActionQueryBuilderDsl of() {
        return new CategoryRemoveAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryRemoveAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryRemoveAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategoryRemoveAssetActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, CategoryRemoveAssetActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategoryRemoveAssetActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, CategoryRemoveAssetActionQueryBuilderDsl::of));
    }
}
