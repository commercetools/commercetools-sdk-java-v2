
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchWildCardExpressionQueryBuilderDsl {
    public ProductSearchWildCardExpressionQueryBuilderDsl() {
    }

    public static ProductSearchWildCardExpressionQueryBuilderDsl of() {
        return new ProductSearchWildCardExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchWildCardExpressionQueryBuilderDsl> wildcard(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("wildcard"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl.of())),
            ProductSearchWildCardExpressionQueryBuilderDsl::of);
    }

}
