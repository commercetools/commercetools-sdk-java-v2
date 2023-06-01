package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteCreatedMessagePayloadQueryBuilderDsl  {
    public StagedQuoteCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static StagedQuoteCreatedMessagePayloadQueryBuilderDsl of() {
        return new StagedQuoteCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteCreatedMessagePayloadQueryBuilderDsl> stagedQuote(
        Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stagedQuote"))
            .inner(fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl.of())),
            StagedQuoteCreatedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
