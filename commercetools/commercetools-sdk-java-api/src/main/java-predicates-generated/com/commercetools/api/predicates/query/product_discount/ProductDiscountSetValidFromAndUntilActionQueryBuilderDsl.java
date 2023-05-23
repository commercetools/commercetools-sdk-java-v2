
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl {
    public ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl() {
    }

    public static ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl of() {
        return new ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

}
