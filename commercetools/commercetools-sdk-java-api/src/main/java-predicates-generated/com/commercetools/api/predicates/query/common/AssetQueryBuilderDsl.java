
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssetQueryBuilderDsl {
    public AssetQueryBuilderDsl() {
    }

    public static AssetQueryBuilderDsl of() {
        return new AssetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssetQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, AssetQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssetQueryBuilderDsl> sources(
            Function<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("sources"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetSourceQueryBuilderDsl.of())),
            AssetQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AssetQueryBuilderDsl> sources() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sources")),
            p -> new CombinationQueryPredicate<>(p, AssetQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssetQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AssetQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssetQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AssetQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<AssetQueryBuilderDsl> tags() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tags")),
            p -> new CombinationQueryPredicate<>(p, AssetQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssetQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            AssetQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AssetQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AssetQueryBuilderDsl::of));
    }

}
