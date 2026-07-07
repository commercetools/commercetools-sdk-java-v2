
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantSetAssetDescriptionActionQueryBuilderDsl {
    public VariantSetAssetDescriptionActionQueryBuilderDsl() {
    }

    public static VariantSetAssetDescriptionActionQueryBuilderDsl of() {
        return new VariantSetAssetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAssetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAssetDescriptionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetDescriptionActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetDescriptionActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSetAssetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            VariantSetAssetDescriptionActionQueryBuilderDsl::of);
    }

}
