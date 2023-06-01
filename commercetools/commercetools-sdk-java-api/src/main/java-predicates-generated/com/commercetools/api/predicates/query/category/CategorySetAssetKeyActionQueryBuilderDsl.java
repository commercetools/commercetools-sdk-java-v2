package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategorySetAssetKeyActionQueryBuilderDsl  {
    public CategorySetAssetKeyActionQueryBuilderDsl() {
    }

    public static CategorySetAssetKeyActionQueryBuilderDsl of() {
        return new CategorySetAssetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetAssetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategorySetAssetKeyActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategorySetAssetKeyActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetKeyActionQueryBuilderDsl::of));
    }
    
}
