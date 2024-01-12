
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchLongRangeExpressionQueryBuilderDsl {
    public ProductSearchLongRangeExpressionQueryBuilderDsl() {
    }

    public static ProductSearchLongRangeExpressionQueryBuilderDsl of() {
        return new ProductSearchLongRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchLongRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("range"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchLongRangeValueQueryBuilderDsl
                            .of())),
            ProductSearchLongRangeExpressionQueryBuilderDsl::of);
    }

}
