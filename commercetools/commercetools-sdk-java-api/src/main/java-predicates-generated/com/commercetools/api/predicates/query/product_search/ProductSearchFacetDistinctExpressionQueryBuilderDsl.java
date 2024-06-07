
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetDistinctExpressionQueryBuilderDsl {
    public ProductSearchFacetDistinctExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFacetDistinctExpressionQueryBuilderDsl of() {
        return new ProductSearchFacetDistinctExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFacetDistinctExpressionQueryBuilderDsl> distinct(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("distinct"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetDistinctValueQueryBuilderDsl
                            .of())),
            ProductSearchFacetDistinctExpressionQueryBuilderDsl::of);
    }

}
