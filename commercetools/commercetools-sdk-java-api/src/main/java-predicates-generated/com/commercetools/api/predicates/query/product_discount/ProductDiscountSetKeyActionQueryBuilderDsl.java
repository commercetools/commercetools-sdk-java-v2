
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountSetKeyActionQueryBuilderDsl {
    public ProductDiscountSetKeyActionQueryBuilderDsl() {
    }

    public static ProductDiscountSetKeyActionQueryBuilderDsl of() {
        return new ProductDiscountSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductDiscountSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetKeyActionQueryBuilderDsl::of));
    }

}
