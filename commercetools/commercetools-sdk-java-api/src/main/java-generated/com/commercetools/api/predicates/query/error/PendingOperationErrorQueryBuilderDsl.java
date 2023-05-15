
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class PendingOperationErrorQueryBuilderDsl {
    public PendingOperationErrorQueryBuilderDsl() {
    }

    public static PendingOperationErrorQueryBuilderDsl of() {
        return new PendingOperationErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PendingOperationErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, PendingOperationErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PendingOperationErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, PendingOperationErrorQueryBuilderDsl::of));
    }
}
