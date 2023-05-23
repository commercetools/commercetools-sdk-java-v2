
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidInputErrorQueryBuilderDsl {
    public InvalidInputErrorQueryBuilderDsl() {
    }

    public static InvalidInputErrorQueryBuilderDsl of() {
        return new InvalidInputErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidInputErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidInputErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidInputErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidInputErrorQueryBuilderDsl::of));
    }

}
