
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetCartPredicateActionQueryBuilderDsl {
    public DiscountCodeSetCartPredicateActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetCartPredicateActionQueryBuilderDsl of() {
        return new DiscountCodeSetCartPredicateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetCartPredicateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetCartPredicateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetCartPredicateActionQueryBuilderDsl> cartPredicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartPredicate")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetCartPredicateActionQueryBuilderDsl::of));
    }

}
