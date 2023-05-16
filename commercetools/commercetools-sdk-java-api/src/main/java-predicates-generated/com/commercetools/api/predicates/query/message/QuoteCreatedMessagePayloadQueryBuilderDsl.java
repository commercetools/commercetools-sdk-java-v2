
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteCreatedMessagePayloadQueryBuilderDsl {
    public QuoteCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteCreatedMessagePayloadQueryBuilderDsl of() {
        return new QuoteCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteCreatedMessagePayloadQueryBuilderDsl> quote(
            Function<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("quote"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl.of())),
            QuoteCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
