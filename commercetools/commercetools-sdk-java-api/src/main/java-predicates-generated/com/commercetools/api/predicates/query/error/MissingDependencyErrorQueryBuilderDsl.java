
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class MissingDependencyErrorQueryBuilderDsl {
    public MissingDependencyErrorQueryBuilderDsl() {
    }

    public static MissingDependencyErrorQueryBuilderDsl of() {
        return new MissingDependencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MissingDependencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, MissingDependencyErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MissingDependencyErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, MissingDependencyErrorQueryBuilderDsl::of));
    }

}
