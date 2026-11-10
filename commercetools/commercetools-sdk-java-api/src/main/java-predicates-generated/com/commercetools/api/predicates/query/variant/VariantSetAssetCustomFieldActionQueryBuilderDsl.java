
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantSetAssetCustomFieldActionQueryBuilderDsl {
    public VariantSetAssetCustomFieldActionQueryBuilderDsl() {
    }

    public static VariantSetAssetCustomFieldActionQueryBuilderDsl of() {
        return new VariantSetAssetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAssetCustomFieldActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomFieldActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomFieldActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAssetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAssetCustomFieldActionQueryBuilderDsl::of));
    }

}
