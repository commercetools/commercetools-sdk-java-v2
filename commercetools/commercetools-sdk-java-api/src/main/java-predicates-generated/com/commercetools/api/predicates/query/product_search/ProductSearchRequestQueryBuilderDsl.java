
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchRequestQueryBuilderDsl {
    public ProductSearchRequestQueryBuilderDsl() {
    }

    public static ProductSearchRequestQueryBuilderDsl of() {
        return new ProductSearchRequestQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchRequestQueryBuilderDsl> query(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("query"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl.of())),
            ProductSearchRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchRequestQueryBuilderDsl> postFilter(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("postFilter"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl.of())),
            ProductSearchRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchRequestQueryBuilderDsl> sort(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchSortingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchSortingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("sort"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchSortingQueryBuilderDsl.of())),
            ProductSearchRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchRequestQueryBuilderDsl> sort() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sort")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchRequestQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchRequestQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchRequestQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSearchRequestQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchRequestQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSearchRequestQueryBuilderDsl> markMatchingVariants() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("markMatchingVariants")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchRequestQueryBuilderDsl> projection(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchProjectionParamsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchProjectionParamsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("projection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchProjectionParamsQueryBuilderDsl
                            .of())),
            ProductSearchRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchRequestQueryBuilderDsl> facets(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("facets"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetExpressionQueryBuilderDsl
                            .of())),
            ProductSearchRequestQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchRequestQueryBuilderDsl> facets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("facets")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchRequestQueryBuilderDsl::of));
    }

}
