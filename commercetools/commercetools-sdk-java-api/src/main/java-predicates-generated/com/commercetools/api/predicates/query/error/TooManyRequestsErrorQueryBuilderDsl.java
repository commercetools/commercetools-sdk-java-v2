
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class TooManyRequestsErrorQueryBuilderDsl {
    public TooManyRequestsErrorQueryBuilderDsl() {
    }

    public static TooManyRequestsErrorQueryBuilderDsl of() {
        return new TooManyRequestsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TooManyRequestsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, TooManyRequestsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TooManyRequestsErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, TooManyRequestsErrorQueryBuilderDsl::of));
    }

}
