
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetRangesValueQueryBuilderDsl {
    public ProductSearchFacetRangesValueQueryBuilderDsl() {
    }

    public static ProductSearchFacetRangesValueQueryBuilderDsl of() {
        return new ProductSearchFacetRangesValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesValueQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesValueQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetRangesValueQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("filter"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            ProductSearchFacetRangesValueQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesValueQueryBuilderDsl> level() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("level")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetRangesValueQueryBuilderDsl> ranges(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesFacetRangeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesFacetRangeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("ranges"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesFacetRangeQueryBuilderDsl
                            .of())),
            ProductSearchFacetRangesValueQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchFacetRangesValueQueryBuilderDsl> ranges() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("ranges")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetRangesValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetRangesValueQueryBuilderDsl::of));
    }

}
