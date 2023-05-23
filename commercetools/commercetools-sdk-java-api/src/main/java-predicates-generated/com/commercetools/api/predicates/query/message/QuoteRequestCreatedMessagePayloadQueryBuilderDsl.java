
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestCreatedMessagePayloadQueryBuilderDsl {
    public QuoteRequestCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteRequestCreatedMessagePayloadQueryBuilderDsl of() {
        return new QuoteRequestCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestCreatedMessagePayloadQueryBuilderDsl> quoteRequest(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("quoteRequest"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl.of())),
            QuoteRequestCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
