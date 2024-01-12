
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchExistsExpressionQueryBuilderDsl {
    public ProductSearchExistsExpressionQueryBuilderDsl() {
    }

    public static ProductSearchExistsExpressionQueryBuilderDsl of() {
        return new ProductSearchExistsExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchExistsExpressionQueryBuilderDsl> exists(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchExistsValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchExistsValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("exists"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchExistsValueQueryBuilderDsl
                            .of())),
            ProductSearchExistsExpressionQueryBuilderDsl::of);
    }

}
