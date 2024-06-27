
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringMoveImageToPositionActionQueryBuilderDsl {
    public ProductTailoringMoveImageToPositionActionQueryBuilderDsl() {
    }

    public static ProductTailoringMoveImageToPositionActionQueryBuilderDsl of() {
        return new ProductTailoringMoveImageToPositionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringMoveImageToPositionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringMoveImageToPositionActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringMoveImageToPositionActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringMoveImageToPositionActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringMoveImageToPositionActionQueryBuilderDsl> position() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("position")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringMoveImageToPositionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringMoveImageToPositionActionQueryBuilderDsl::of));
    }

}
