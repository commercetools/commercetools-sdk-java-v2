
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetImageLabelActionQueryBuilderDsl {
    public ProductTailoringSetImageLabelActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetImageLabelActionQueryBuilderDsl of() {
        return new ProductTailoringSetImageLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetImageLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetImageLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetImageLabelActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetImageLabelActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringSetImageLabelActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetImageLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetImageLabelActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetImageLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetImageLabelActionQueryBuilderDsl> label() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("label")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetImageLabelActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetImageLabelActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetImageLabelActionQueryBuilderDsl::of));
    }

}
