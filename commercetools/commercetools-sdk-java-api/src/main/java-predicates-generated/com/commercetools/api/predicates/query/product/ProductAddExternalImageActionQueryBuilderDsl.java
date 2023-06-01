package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductAddExternalImageActionQueryBuilderDsl  {
    public ProductAddExternalImageActionQueryBuilderDsl() {
    }

    public static ProductAddExternalImageActionQueryBuilderDsl of() {
        return new ProductAddExternalImageActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAddExternalImageActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductAddExternalImageActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductAddExternalImageActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductAddExternalImageActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductAddExternalImageActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductAddExternalImageActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductAddExternalImageActionQueryBuilderDsl> image(
        Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("image"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductAddExternalImageActionQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductAddExternalImageActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductAddExternalImageActionQueryBuilderDsl::of));
    }
    
}
