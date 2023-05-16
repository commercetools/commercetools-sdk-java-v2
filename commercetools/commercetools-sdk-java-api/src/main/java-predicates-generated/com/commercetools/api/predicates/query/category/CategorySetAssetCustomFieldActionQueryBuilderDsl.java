
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategorySetAssetCustomFieldActionQueryBuilderDsl {
    public CategorySetAssetCustomFieldActionQueryBuilderDsl() {
    }

    public static CategorySetAssetCustomFieldActionQueryBuilderDsl of() {
        return new CategorySetAssetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetAssetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetCustomFieldActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetCustomFieldActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomFieldActionQueryBuilderDsl::of));
    }

}
