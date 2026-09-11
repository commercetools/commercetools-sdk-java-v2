
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class CircularDependencyErrorQueryBuilderDsl {
    public CircularDependencyErrorQueryBuilderDsl() {
    }

    public static CircularDependencyErrorQueryBuilderDsl of() {
        return new CircularDependencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CircularDependencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, CircularDependencyErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CircularDependencyErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, CircularDependencyErrorQueryBuilderDsl::of));
    }

}
