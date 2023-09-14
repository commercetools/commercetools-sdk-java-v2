
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl {
    public QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl of() {
        return new QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl> buyerComment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerComment")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl::of));
    }

}
