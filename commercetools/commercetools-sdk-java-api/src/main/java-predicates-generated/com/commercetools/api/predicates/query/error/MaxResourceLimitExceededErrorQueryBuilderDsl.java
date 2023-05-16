
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class MaxResourceLimitExceededErrorQueryBuilderDsl {
    public MaxResourceLimitExceededErrorQueryBuilderDsl() {
    }

    public static MaxResourceLimitExceededErrorQueryBuilderDsl of() {
        return new MaxResourceLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MaxResourceLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, MaxResourceLimitExceededErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MaxResourceLimitExceededErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, MaxResourceLimitExceededErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MaxResourceLimitExceededErrorQueryBuilderDsl> exceededResource() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("exceededResource")),
            p -> new CombinationQueryPredicate<>(p, MaxResourceLimitExceededErrorQueryBuilderDsl::of));
    }

}
