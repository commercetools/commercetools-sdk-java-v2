
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class MaxDiscountGroupsReachedErrorQueryBuilderDsl {
    public MaxDiscountGroupsReachedErrorQueryBuilderDsl() {
    }

    public static MaxDiscountGroupsReachedErrorQueryBuilderDsl of() {
        return new MaxDiscountGroupsReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MaxDiscountGroupsReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, MaxDiscountGroupsReachedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MaxDiscountGroupsReachedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, MaxDiscountGroupsReachedErrorQueryBuilderDsl::of));
    }

}
