
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidCurrentPasswordErrorQueryBuilderDsl {
    public InvalidCurrentPasswordErrorQueryBuilderDsl() {
    }

    public static InvalidCurrentPasswordErrorQueryBuilderDsl of() {
        return new InvalidCurrentPasswordErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidCurrentPasswordErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidCurrentPasswordErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidCurrentPasswordErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidCurrentPasswordErrorQueryBuilderDsl::of));
    }

}
