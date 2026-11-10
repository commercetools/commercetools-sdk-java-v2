
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetStatsValueQueryBuilderDsl {
    public ProductSearchFacetStatsValueQueryBuilderDsl() {
    }

    public static ProductSearchFacetStatsValueQueryBuilderDsl of() {
        return new ProductSearchFacetStatsValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetStatsValueQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetStatsValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetStatsValueQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetStatsValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchFacetStatsValueQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("filter"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.search.SearchQueryQueryBuilderDsl.of())),
            ProductSearchFacetStatsValueQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetStatsValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetStatsValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchFacetStatsValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetStatsValueQueryBuilderDsl::of));
    }

}
