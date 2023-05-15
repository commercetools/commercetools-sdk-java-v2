
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class HttpDestinationAuthenticationQueryBuilderDsl {
    public HttpDestinationAuthenticationQueryBuilderDsl() {
    }

    public static HttpDestinationAuthenticationQueryBuilderDsl of() {
        return new HttpDestinationAuthenticationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<HttpDestinationAuthenticationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, HttpDestinationAuthenticationQueryBuilderDsl::of));
    }
}
