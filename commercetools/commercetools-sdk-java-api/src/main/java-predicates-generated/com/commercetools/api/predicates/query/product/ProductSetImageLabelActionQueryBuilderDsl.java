package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetImageLabelActionQueryBuilderDsl  {
    public ProductSetImageLabelActionQueryBuilderDsl() {
    }

    public static ProductSetImageLabelActionQueryBuilderDsl of() {
        return new ProductSetImageLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetImageLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetImageLabelActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetImageLabelActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductSetImageLabelActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSetImageLabelActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetImageLabelActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetImageLabelActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
        p -> new CombinationQueryPredicate<>(p, ProductSetImageLabelActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetImageLabelActionQueryBuilderDsl> label() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("label")),
        p -> new CombinationQueryPredicate<>(p, ProductSetImageLabelActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetImageLabelActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetImageLabelActionQueryBuilderDsl::of));
    }
    
}
