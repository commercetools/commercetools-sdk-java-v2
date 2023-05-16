
package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountSetValidFromActionQueryBuilderDsl {
    public ProductDiscountSetValidFromActionQueryBuilderDsl() {
    }

    public static ProductDiscountSetValidFromActionQueryBuilderDsl of() {
        return new ProductDiscountSetValidFromActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountSetValidFromActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetValidFromActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountSetValidFromActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetValidFromActionQueryBuilderDsl::of));
    }

}
