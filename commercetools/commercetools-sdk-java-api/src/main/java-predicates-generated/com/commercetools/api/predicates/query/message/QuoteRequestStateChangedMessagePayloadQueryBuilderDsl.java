package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteRequestStateChangedMessagePayloadQueryBuilderDsl  {
    public QuoteRequestStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteRequestStateChangedMessagePayloadQueryBuilderDsl of() {
        return new QuoteRequestStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestStateChangedMessagePayloadQueryBuilderDsl> quoteRequestState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteRequestState")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestStateChangedMessagePayloadQueryBuilderDsl> oldQuoteRequestState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuoteRequestState")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
