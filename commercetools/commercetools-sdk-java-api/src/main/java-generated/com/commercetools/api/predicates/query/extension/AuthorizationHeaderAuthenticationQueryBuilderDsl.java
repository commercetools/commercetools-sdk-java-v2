
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class AuthorizationHeaderAuthenticationQueryBuilderDsl {
    public AuthorizationHeaderAuthenticationQueryBuilderDsl() {
    }

    public static AuthorizationHeaderAuthenticationQueryBuilderDsl of() {
        return new AuthorizationHeaderAuthenticationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AuthorizationHeaderAuthenticationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AuthorizationHeaderAuthenticationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AuthorizationHeaderAuthenticationQueryBuilderDsl> headerValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("headerValue")),
            p -> new CombinationQueryPredicate<>(p, AuthorizationHeaderAuthenticationQueryBuilderDsl::of));
    }
}
