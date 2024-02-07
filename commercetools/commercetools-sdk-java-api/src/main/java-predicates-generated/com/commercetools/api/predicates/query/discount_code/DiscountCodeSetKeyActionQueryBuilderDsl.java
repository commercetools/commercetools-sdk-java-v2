
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetKeyActionQueryBuilderDsl {
    public DiscountCodeSetKeyActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetKeyActionQueryBuilderDsl of() {
        return new DiscountCodeSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetKeyActionQueryBuilderDsl::of));
    }

}
