
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountSetValidUntilActionQueryBuilderDsl {
    public ProductDiscountSetValidUntilActionQueryBuilderDsl() {
    }

    public static ProductDiscountSetValidUntilActionQueryBuilderDsl of() {
        return new ProductDiscountSetValidUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountSetValidUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetValidUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountSetValidUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetValidUntilActionQueryBuilderDsl::of));
    }
}
