
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantSetImageLabelActionQueryBuilderDsl {
    public VariantSetImageLabelActionQueryBuilderDsl() {
    }

    public static VariantSetImageLabelActionQueryBuilderDsl of() {
        return new VariantSetImageLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetImageLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetImageLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetImageLabelActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
            p -> new CombinationQueryPredicate<>(p, VariantSetImageLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetImageLabelActionQueryBuilderDsl> label() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("label")),
            p -> new CombinationQueryPredicate<>(p, VariantSetImageLabelActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetImageLabelActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetImageLabelActionQueryBuilderDsl::of));
    }

}
