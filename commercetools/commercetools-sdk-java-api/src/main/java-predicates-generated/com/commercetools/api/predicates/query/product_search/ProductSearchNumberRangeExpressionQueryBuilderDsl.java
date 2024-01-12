
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchNumberRangeExpressionQueryBuilderDsl {
    public ProductSearchNumberRangeExpressionQueryBuilderDsl() {
    }

    public static ProductSearchNumberRangeExpressionQueryBuilderDsl of() {
        return new ProductSearchNumberRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchNumberRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("range"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchNumberRangeValueQueryBuilderDsl
                            .of())),
            ProductSearchNumberRangeExpressionQueryBuilderDsl::of);
    }

}
