
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetCountValueQueryBuilderDsl {
    public ProductSearchFacetCountValueQueryBuilderDsl() {
    }

    public static ProductSearchFacetCountValueQueryBuilderDsl of() {
        return new ProductSearchFacetCountValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetCountValueQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetCountValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetCountValueQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetCountValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetCountValueQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("filter"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl.of())),
            ProductSearchFacetCountValueQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetCountValueQueryBuilderDsl> level() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("level")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetCountValueQueryBuilderDsl::of));
    }

}
