
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeUpdateActionQueryBuilderDsl {
    public DiscountCodeUpdateActionQueryBuilderDsl() {
    }

    public static DiscountCodeUpdateActionQueryBuilderDsl of() {
        return new DiscountCodeUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeUpdateActionQueryBuilderDsl::of));
    }
}
