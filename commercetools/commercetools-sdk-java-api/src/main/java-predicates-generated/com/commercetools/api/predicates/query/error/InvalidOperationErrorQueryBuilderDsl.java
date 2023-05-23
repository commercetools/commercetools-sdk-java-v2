
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidOperationErrorQueryBuilderDsl {
    public InvalidOperationErrorQueryBuilderDsl() {
    }

    public static InvalidOperationErrorQueryBuilderDsl of() {
        return new InvalidOperationErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidOperationErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidOperationErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidOperationErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidOperationErrorQueryBuilderDsl::of));
    }

}
