
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategorySetAssetDescriptionActionQueryBuilderDsl {
    public CategorySetAssetDescriptionActionQueryBuilderDsl() {
    }

    public static CategorySetAssetDescriptionActionQueryBuilderDsl of() {
        return new CategorySetAssetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetAssetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetDescriptionActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetAssetDescriptionActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, CategorySetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategorySetAssetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategorySetAssetDescriptionActionQueryBuilderDsl::of);
    }

}
