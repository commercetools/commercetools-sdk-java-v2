
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountUpdateActionQueryBuilderDsl {
    public ProductDiscountUpdateActionQueryBuilderDsl() {
    }

    public static ProductDiscountUpdateActionQueryBuilderDsl of() {
        return new ProductDiscountUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountUpdateActionQueryBuilderDsl::of));
    }
}
