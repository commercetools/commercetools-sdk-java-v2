
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchTimeRangeExpressionQueryBuilderDsl {
    public ProductSearchTimeRangeExpressionQueryBuilderDsl() {
    }

    public static ProductSearchTimeRangeExpressionQueryBuilderDsl of() {
        return new ProductSearchTimeRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchTimeRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("range"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchTimeRangeValueQueryBuilderDsl
                            .of())),
            ProductSearchTimeRangeExpressionQueryBuilderDsl::of);
    }

}
