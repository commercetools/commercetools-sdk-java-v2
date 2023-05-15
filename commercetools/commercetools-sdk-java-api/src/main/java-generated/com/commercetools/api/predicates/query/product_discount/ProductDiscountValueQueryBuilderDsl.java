
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueQueryBuilderDsl {
    public ProductDiscountValueQueryBuilderDsl() {
    }

    public static ProductDiscountValueQueryBuilderDsl of() {
        return new ProductDiscountValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueQueryBuilderDsl::of));
    }
}
