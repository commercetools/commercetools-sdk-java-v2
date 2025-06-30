
package com.commercetools.api.predicates.query.discount_group;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupSetSortOrderActionQueryBuilderDsl {
    public DiscountGroupSetSortOrderActionQueryBuilderDsl() {
    }

    public static DiscountGroupSetSortOrderActionQueryBuilderDsl of() {
        return new DiscountGroupSetSortOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupSetSortOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetSortOrderActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupSetSortOrderActionQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSetSortOrderActionQueryBuilderDsl::of));
    }

}
