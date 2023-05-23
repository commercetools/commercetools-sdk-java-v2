
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductMoveImageToPositionActionQueryBuilderDsl {
    public ProductMoveImageToPositionActionQueryBuilderDsl() {
    }

    public static ProductMoveImageToPositionActionQueryBuilderDsl of() {
        return new ProductMoveImageToPositionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductMoveImageToPositionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductMoveImageToPositionActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductMoveImageToPositionActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductMoveImageToPositionActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
            p -> new CombinationQueryPredicate<>(p, ProductMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductMoveImageToPositionActionQueryBuilderDsl> position() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("position")),
            p -> new CombinationQueryPredicate<>(p, ProductMoveImageToPositionActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductMoveImageToPositionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductMoveImageToPositionActionQueryBuilderDsl::of));
    }

}
