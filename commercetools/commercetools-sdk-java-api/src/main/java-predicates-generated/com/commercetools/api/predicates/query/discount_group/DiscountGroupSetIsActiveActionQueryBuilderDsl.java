
package com.commercetools.api.predicates.query.discount_group;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupSetIsActiveActionQueryBuilderDsl {
    public DiscountGroupSetIsActiveActionQueryBuilderDsl() {
    }

    public static DiscountGroupSetIsActiveActionQueryBuilderDsl of() {
        return new DiscountGroupSetIsActiveActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupSetIsActiveActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetIsActiveActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<DiscountGroupSetIsActiveActionQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetIsActiveActionQueryBuilderDsl::of));
    }

}
