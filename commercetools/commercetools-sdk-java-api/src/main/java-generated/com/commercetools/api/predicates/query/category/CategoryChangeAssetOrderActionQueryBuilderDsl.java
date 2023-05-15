
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategoryChangeAssetOrderActionQueryBuilderDsl {
    public CategoryChangeAssetOrderActionQueryBuilderDsl() {
    }

    public static CategoryChangeAssetOrderActionQueryBuilderDsl of() {
        return new CategoryChangeAssetOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryChangeAssetOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryChangeAssetOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CategoryChangeAssetOrderActionQueryBuilderDsl> assetOrder() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetOrder")),
            p -> new CombinationQueryPredicate<>(p, CategoryChangeAssetOrderActionQueryBuilderDsl::of));
    }
}
