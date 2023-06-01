package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductProjectionPagedSearchResponseQueryBuilderDsl  {
    public ProductProjectionPagedSearchResponseQueryBuilderDsl() {
    }

    public static ProductProjectionPagedSearchResponseQueryBuilderDsl of() {
        return new ProductProjectionPagedSearchResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductProjectionPagedSearchResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedSearchResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductProjectionPagedSearchResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedSearchResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductProjectionPagedSearchResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedSearchResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductProjectionPagedSearchResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedSearchResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductProjectionPagedSearchResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductProjectionPagedSearchResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductProjectionPagedSearchResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, ProductProjectionPagedSearchResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductProjectionPagedSearchResponseQueryBuilderDsl> facets(
        Function<com.commercetools.api.predicates.query.product.FacetResultsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.FacetResultsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("facets"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.FacetResultsQueryBuilderDsl.of())),
            ProductProjectionPagedSearchResponseQueryBuilderDsl::of);
    }
    
    
}
