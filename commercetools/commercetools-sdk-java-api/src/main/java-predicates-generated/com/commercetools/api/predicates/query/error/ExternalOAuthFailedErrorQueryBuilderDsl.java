
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExternalOAuthFailedErrorQueryBuilderDsl {
    public ExternalOAuthFailedErrorQueryBuilderDsl() {
    }

    public static ExternalOAuthFailedErrorQueryBuilderDsl of() {
        return new ExternalOAuthFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExternalOAuthFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExternalOAuthFailedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExternalOAuthFailedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExternalOAuthFailedErrorQueryBuilderDsl::of));
    }

}
