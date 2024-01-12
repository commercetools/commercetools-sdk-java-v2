
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchDateTimeRangeExpressionQueryBuilderDsl {
    public ProductSearchDateTimeRangeExpressionQueryBuilderDsl() {
    }

    public static ProductSearchDateTimeRangeExpressionQueryBuilderDsl of() {
        return new ProductSearchDateTimeRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchDateTimeRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("range"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchDateTimeRangeValueQueryBuilderDsl
                            .of())),
            ProductSearchDateTimeRangeExpressionQueryBuilderDsl::of);
    }

}
