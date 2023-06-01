package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategorySetAssetSourcesActionQueryBuilderDsl  {
    public CategorySetAssetSourcesActionQueryBuilderDsl() {
    }

    public static CategorySetAssetSourcesActionQueryBuilderDsl of() {
        return new CategorySetAssetSourcesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetAssetSourcesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetSourcesActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategorySetAssetSourcesActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetSourcesActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategorySetAssetSourcesActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetSourcesActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategorySetAssetSourcesActionQueryBuilderDsl> sources(
        Function<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("sources"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl.of())),
            CategorySetAssetSourcesActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CategorySetAssetSourcesActionQueryBuilderDsl> sources() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sources")),
                p -> new CombinationQueryPredicate<>(p, CategorySetAssetSourcesActionQueryBuilderDsl::of));
    }
    
}
