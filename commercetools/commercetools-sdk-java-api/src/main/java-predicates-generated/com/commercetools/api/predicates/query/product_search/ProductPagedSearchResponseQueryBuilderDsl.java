
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPagedSearchResponseQueryBuilderDsl {
    public ProductPagedSearchResponseQueryBuilderDsl() {
    }

    public static ProductPagedSearchResponseQueryBuilderDsl of() {
        return new ProductPagedSearchResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductPagedSearchResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPagedSearchResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPagedSearchResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedSearchResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPagedSearchResponseQueryBuilderDsl> facets(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("facets"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultQueryBuilderDsl
                            .of())),
            ProductPagedSearchResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductPagedSearchResponseQueryBuilderDsl> facets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("facets")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedSearchResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPagedSearchResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_search.ProductSearchResultQueryBuilderDsl.of())),
            ProductPagedSearchResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductPagedSearchResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductPagedSearchResponseQueryBuilderDsl::of));
    }

}
