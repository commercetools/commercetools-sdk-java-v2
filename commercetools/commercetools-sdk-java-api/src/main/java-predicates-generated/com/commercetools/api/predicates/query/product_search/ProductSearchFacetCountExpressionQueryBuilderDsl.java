
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetCountExpressionQueryBuilderDsl {
    public ProductSearchFacetCountExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFacetCountExpressionQueryBuilderDsl of() {
        return new ProductSearchFacetCountExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFacetCountExpressionQueryBuilderDsl> count(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetCountValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetCountValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("count"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetCountValueQueryBuilderDsl
                            .of())),
            ProductSearchFacetCountExpressionQueryBuilderDsl::of);
    }

}
