
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryAddAssetActionQueryBuilderDsl {
    public CategoryAddAssetActionQueryBuilderDsl() {
    }

    public static CategoryAddAssetActionQueryBuilderDsl of() {
        return new CategoryAddAssetActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryAddAssetActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryAddAssetActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryAddAssetActionQueryBuilderDsl> asset(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("asset"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            CategoryAddAssetActionQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CategoryAddAssetActionQueryBuilderDsl> position() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("position")),
            p -> new CombinationQueryPredicate<>(p, CategoryAddAssetActionQueryBuilderDsl::of));
    }

}
