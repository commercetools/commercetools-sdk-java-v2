
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ErrorObjectQueryBuilderDsl {
    public ErrorObjectQueryBuilderDsl() {
    }

    public static ErrorObjectQueryBuilderDsl of() {
        return new ErrorObjectQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ErrorObjectQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ErrorObjectQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ErrorObjectQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ErrorObjectQueryBuilderDsl::of));
    }
}
