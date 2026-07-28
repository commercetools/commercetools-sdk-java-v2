
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantMoveImageToPositionActionQueryBuilderDsl {
    public VariantMoveImageToPositionActionQueryBuilderDsl() {
    }

    public static VariantMoveImageToPositionActionQueryBuilderDsl of() {
        return new VariantMoveImageToPositionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantMoveImageToPositionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantMoveImageToPositionActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
            p -> new CombinationQueryPredicate<>(p, VariantMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantMoveImageToPositionActionQueryBuilderDsl> position() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("position")),
            p -> new CombinationQueryPredicate<>(p, VariantMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantMoveImageToPositionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantMoveImageToPositionActionQueryBuilderDsl::of));
    }

}
