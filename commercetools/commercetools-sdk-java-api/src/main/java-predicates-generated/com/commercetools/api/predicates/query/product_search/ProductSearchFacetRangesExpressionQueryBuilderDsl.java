
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetRangesExpressionQueryBuilderDsl {
    public ProductSearchFacetRangesExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFacetRangesExpressionQueryBuilderDsl of() {
        return new ProductSearchFacetRangesExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFacetRangesExpressionQueryBuilderDsl> ranges(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("ranges"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetRangesValueQueryBuilderDsl
                            .of())),
            ProductSearchFacetRangesExpressionQueryBuilderDsl::of);
    }

}
