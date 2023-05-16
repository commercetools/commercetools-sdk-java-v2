
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidTokenErrorQueryBuilderDsl {
    public InvalidTokenErrorQueryBuilderDsl() {
    }

    public static InvalidTokenErrorQueryBuilderDsl of() {
        return new InvalidTokenErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidTokenErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidTokenErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidTokenErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidTokenErrorQueryBuilderDsl::of));
    }

}
