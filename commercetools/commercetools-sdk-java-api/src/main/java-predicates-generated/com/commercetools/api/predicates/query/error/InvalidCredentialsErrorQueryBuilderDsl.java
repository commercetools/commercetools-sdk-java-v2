
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class InvalidCredentialsErrorQueryBuilderDsl {
    public InvalidCredentialsErrorQueryBuilderDsl() {
    }

    public static InvalidCredentialsErrorQueryBuilderDsl of() {
        return new InvalidCredentialsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidCredentialsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, InvalidCredentialsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<InvalidCredentialsErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, InvalidCredentialsErrorQueryBuilderDsl::of));
    }

}
