
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class QuoteStateChangedMessagePayloadQueryBuilderDsl {
    public QuoteStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteStateChangedMessagePayloadQueryBuilderDsl of() {
        return new QuoteStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteStateChangedMessagePayloadQueryBuilderDsl> quoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteState")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteStateChangedMessagePayloadQueryBuilderDsl> oldQuoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuoteState")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessagePayloadQueryBuilderDsl::of));
    }

}
