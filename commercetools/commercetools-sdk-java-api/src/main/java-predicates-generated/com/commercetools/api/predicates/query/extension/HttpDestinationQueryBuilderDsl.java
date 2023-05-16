
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class HttpDestinationQueryBuilderDsl {
    public HttpDestinationQueryBuilderDsl() {
    }

    public static HttpDestinationQueryBuilderDsl of() {
        return new HttpDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<HttpDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, HttpDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<HttpDestinationQueryBuilderDsl> url() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("url")),
            p -> new CombinationQueryPredicate<>(p, HttpDestinationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<HttpDestinationQueryBuilderDsl> authentication(
            Function<com.commercetools.api.predicates.query.extension.HttpDestinationAuthenticationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.HttpDestinationAuthenticationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("authentication"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.extension.HttpDestinationAuthenticationQueryBuilderDsl
                            .of())),
            HttpDestinationQueryBuilderDsl::of);
    }

}
