package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssetSourceQueryBuilderDsl  {
    public AssetSourceQueryBuilderDsl() {
    }

    public static AssetSourceQueryBuilderDsl of() {
        return new AssetSourceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssetSourceQueryBuilderDsl> uri() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("uri")),
        p -> new CombinationQueryPredicate<>(p, AssetSourceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssetSourceQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AssetSourceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssetSourceQueryBuilderDsl> dimensions(
        Function<com.commercetools.api.predicates.query.common.AssetDimensionsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDimensionsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("dimensions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDimensionsQueryBuilderDsl.of())),
            AssetSourceQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<AssetSourceQueryBuilderDsl> contentType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contentType")),
        p -> new CombinationQueryPredicate<>(p, AssetSourceQueryBuilderDsl::of));
    }
    
}
