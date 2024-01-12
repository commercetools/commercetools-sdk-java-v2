
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchPrefixExpressionQueryBuilderDsl {
    public ProductSearchPrefixExpressionQueryBuilderDsl() {
    }

    public static ProductSearchPrefixExpressionQueryBuilderDsl of() {
        return new ProductSearchPrefixExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchPrefixExpressionQueryBuilderDsl> prefix(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("prefix"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchAnyValueQueryBuilderDsl.of())),
            ProductSearchPrefixExpressionQueryBuilderDsl::of);
    }

}
