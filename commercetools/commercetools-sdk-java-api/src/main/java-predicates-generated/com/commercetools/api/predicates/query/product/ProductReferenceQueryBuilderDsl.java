package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductReferenceQueryBuilderDsl  {
    public ProductReferenceQueryBuilderDsl() {
    }

    public static ProductReferenceQueryBuilderDsl of() {
        return new ProductReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ProductReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl.of())),
            ProductReferenceQueryBuilderDsl::of);
    }
    
    
}
