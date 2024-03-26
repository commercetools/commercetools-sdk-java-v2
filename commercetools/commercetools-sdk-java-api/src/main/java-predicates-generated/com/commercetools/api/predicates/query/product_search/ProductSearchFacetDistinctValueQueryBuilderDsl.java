
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetDistinctValueQueryBuilderDsl {
    public ProductSearchFacetDistinctValueQueryBuilderDsl() {
    }

    public static ProductSearchFacetDistinctValueQueryBuilderDsl of() {
        return new ProductSearchFacetDistinctValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetDistinctValueQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("filter"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            ProductSearchFacetDistinctValueQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> level() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("level")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> includes() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includes")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetDistinctValueQueryBuilderDsl> sort(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("sort"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctBucketSortExpressionQueryBuilderDsl
                            .of())),
            ProductSearchFacetDistinctValueQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetDistinctValueQueryBuilderDsl> missing() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("missing")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetDistinctValueQueryBuilderDsl::of));
    }

}
