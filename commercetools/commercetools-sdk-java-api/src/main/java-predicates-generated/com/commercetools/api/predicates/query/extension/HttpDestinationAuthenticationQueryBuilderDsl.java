
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

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

    public CombinationQueryPredicate<HttpDestinationAuthenticationQueryBuilderDsl> asAuthorizationHeader(
            Function<com.commercetools.api.predicates.query.extension.AuthorizationHeaderAuthenticationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.AuthorizationHeaderAuthenticationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.extension.AuthorizationHeaderAuthenticationQueryBuilderDsl.of()),
            HttpDestinationAuthenticationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<HttpDestinationAuthenticationQueryBuilderDsl> asAzureFunctions(
            Function<com.commercetools.api.predicates.query.extension.AzureFunctionsAuthenticationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.AzureFunctionsAuthenticationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.extension.AzureFunctionsAuthenticationQueryBuilderDsl.of()),
            HttpDestinationAuthenticationQueryBuilderDsl::of);
    }
}
