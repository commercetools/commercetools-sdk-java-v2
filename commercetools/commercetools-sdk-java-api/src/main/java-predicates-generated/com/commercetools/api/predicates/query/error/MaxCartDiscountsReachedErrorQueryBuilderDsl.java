
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class MaxCartDiscountsReachedErrorQueryBuilderDsl {
    public MaxCartDiscountsReachedErrorQueryBuilderDsl() {
    }

    public static MaxCartDiscountsReachedErrorQueryBuilderDsl of() {
        return new MaxCartDiscountsReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MaxCartDiscountsReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, MaxCartDiscountsReachedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MaxCartDiscountsReachedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, MaxCartDiscountsReachedErrorQueryBuilderDsl::of));
    }

}
