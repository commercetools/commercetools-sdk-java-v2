package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategorySetAssetCustomTypeActionQueryBuilderDsl  {
    public CategorySetAssetCustomTypeActionQueryBuilderDsl() {
    }

    public static CategorySetAssetCustomTypeActionQueryBuilderDsl of() {
        return new CategorySetAssetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetAssetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategorySetAssetCustomTypeActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CategorySetAssetCustomTypeActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
        p -> new CombinationQueryPredicate<>(p, CategorySetAssetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategorySetAssetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CategorySetAssetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CategorySetAssetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CategorySetAssetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
