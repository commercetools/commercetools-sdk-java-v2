
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchDateRangeExpressionQueryBuilderDsl {
    public ProductSearchDateRangeExpressionQueryBuilderDsl() {
    }

    public static ProductSearchDateRangeExpressionQueryBuilderDsl of() {
        return new ProductSearchDateRangeExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchDateRangeExpressionQueryBuilderDsl> range(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("range"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchDateRangeValueQueryBuilderDsl
                            .of())),
            ProductSearchDateRangeExpressionQueryBuilderDsl::of);
    }

}
