
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ExternalOAuthQueryBuilderDsl {
    public ExternalOAuthQueryBuilderDsl() {
    }

    public static ExternalOAuthQueryBuilderDsl of() {
        return new ExternalOAuthQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExternalOAuthQueryBuilderDsl> url() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("url")),
            p -> new CombinationQueryPredicate<>(p, ExternalOAuthQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExternalOAuthQueryBuilderDsl> authorizationHeader() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authorizationHeader")),
            p -> new CombinationQueryPredicate<>(p, ExternalOAuthQueryBuilderDsl::of));
    }
}
