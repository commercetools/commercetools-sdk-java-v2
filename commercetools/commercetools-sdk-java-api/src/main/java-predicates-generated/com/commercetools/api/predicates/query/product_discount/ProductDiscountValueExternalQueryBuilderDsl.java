
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueExternalQueryBuilderDsl {
    public ProductDiscountValueExternalQueryBuilderDsl() {
    }

    public static ProductDiscountValueExternalQueryBuilderDsl of() {
        return new ProductDiscountValueExternalQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueExternalQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueExternalQueryBuilderDsl::of));
    }

}
