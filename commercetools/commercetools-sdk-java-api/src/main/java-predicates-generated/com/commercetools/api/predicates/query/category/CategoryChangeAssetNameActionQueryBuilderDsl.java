package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategoryChangeAssetNameActionQueryBuilderDsl  {
    public CategoryChangeAssetNameActionQueryBuilderDsl() {
    }

    public static CategoryChangeAssetNameActionQueryBuilderDsl of() {
        return new CategoryChangeAssetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryChangeAssetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategoryChangeAssetNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategoryChangeAssetNameActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
        p -> new CombinationQueryPredicate<>(p, CategoryChangeAssetNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategoryChangeAssetNameActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
        p -> new CombinationQueryPredicate<>(p, CategoryChangeAssetNameActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategoryChangeAssetNameActionQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryChangeAssetNameActionQueryBuilderDsl::of);
    }
    
    
}
