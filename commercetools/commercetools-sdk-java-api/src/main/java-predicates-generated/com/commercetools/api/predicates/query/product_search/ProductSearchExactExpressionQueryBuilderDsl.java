
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchExactExpressionQueryBuilderDsl {
    public ProductSearchExactExpressionQueryBuilderDsl() {
    }

    public static ProductSearchExactExpressionQueryBuilderDsl of() {
        return new ProductSearchExactExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchExactExpressionQueryBuilderDsl> exact(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("exact"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl.of())),
            ProductSearchExactExpressionQueryBuilderDsl::of);
    }

}
