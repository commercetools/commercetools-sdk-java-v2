
package com.commercetools.api.predicates.query.discount_group;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupSetKeyActionQueryBuilderDsl {
    public DiscountGroupSetKeyActionQueryBuilderDsl() {
    }

    public static DiscountGroupSetKeyActionQueryBuilderDsl of() {
        return new DiscountGroupSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetKeyActionQueryBuilderDsl::of));
    }

}
