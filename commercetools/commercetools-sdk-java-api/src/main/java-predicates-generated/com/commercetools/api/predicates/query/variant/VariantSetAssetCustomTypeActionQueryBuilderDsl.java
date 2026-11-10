
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantSetAssetCustomTypeActionQueryBuilderDsl {
    public VariantSetAssetCustomTypeActionQueryBuilderDsl() {
    }

    public static VariantSetAssetCustomTypeActionQueryBuilderDsl of() {
        return new VariantSetAssetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAssetCustomTypeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomTypeActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomTypeActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSetAssetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            VariantSetAssetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantSetAssetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            VariantSetAssetCustomTypeActionQueryBuilderDsl::of);
    }

}
