
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetStatsExpressionQueryBuilderDsl {
    public ProductSearchFacetStatsExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFacetStatsExpressionQueryBuilderDsl of() {
        return new ProductSearchFacetStatsExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFacetStatsExpressionQueryBuilderDsl> stats(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetStatsValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetStatsValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stats"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetStatsValueQueryBuilderDsl
                            .of())),
            ProductSearchFacetStatsExpressionQueryBuilderDsl::of);
    }

}
