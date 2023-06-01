package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssetDraftQueryBuilderDsl  {
    public AssetDraftQueryBuilderDsl() {
    }

    public static AssetDraftQueryBuilderDsl of() {
        return new AssetDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AssetDraftQueryBuilderDsl> sources(
        Function<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("sources"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl.of())),
            AssetDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<AssetDraftQueryBuilderDsl> sources() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sources")),
                p -> new CombinationQueryPredicate<>(p, AssetDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssetDraftQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AssetDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AssetDraftQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AssetDraftQueryBuilderDsl::of);
    }
    
    public StringCollectionPredicateBuilder<AssetDraftQueryBuilderDsl> tags() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tags")),
        p -> new CombinationQueryPredicate<>(p, AssetDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssetDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            AssetDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<AssetDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AssetDraftQueryBuilderDsl::of));
    }
    
}
