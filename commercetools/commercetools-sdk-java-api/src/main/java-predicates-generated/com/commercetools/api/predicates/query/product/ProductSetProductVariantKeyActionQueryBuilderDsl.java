package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetProductVariantKeyActionQueryBuilderDsl  {
    public ProductSetProductVariantKeyActionQueryBuilderDsl() {
    }

    public static ProductSetProductVariantKeyActionQueryBuilderDsl of() {
        return new ProductSetProductVariantKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetProductVariantKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductVariantKeyActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSetProductVariantKeyActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductVariantKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetProductVariantKeyActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductVariantKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetProductVariantKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductVariantKeyActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetProductVariantKeyActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductVariantKeyActionQueryBuilderDsl::of));
    }
    
}
