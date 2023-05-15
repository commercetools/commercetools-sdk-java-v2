
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountChangeIsActiveActionQueryBuilderDsl {
    public ProductDiscountChangeIsActiveActionQueryBuilderDsl() {
    }

    public static ProductDiscountChangeIsActiveActionQueryBuilderDsl of() {
        return new ProductDiscountChangeIsActiveActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountChangeIsActiveActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountChangeIsActiveActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductDiscountChangeIsActiveActionQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountChangeIsActiveActionQueryBuilderDsl::of));
    }
}
