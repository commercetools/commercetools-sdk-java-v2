
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeChangeIsActiveActionQueryBuilderDsl {
    public DiscountCodeChangeIsActiveActionQueryBuilderDsl() {
    }

    public static DiscountCodeChangeIsActiveActionQueryBuilderDsl of() {
        return new DiscountCodeChangeIsActiveActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeChangeIsActiveActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeChangeIsActiveActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<DiscountCodeChangeIsActiveActionQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeChangeIsActiveActionQueryBuilderDsl::of));
    }
}
