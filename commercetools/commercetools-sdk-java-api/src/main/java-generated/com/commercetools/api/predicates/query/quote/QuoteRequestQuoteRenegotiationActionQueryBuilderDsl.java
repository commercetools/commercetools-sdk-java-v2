
package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestQuoteRenegotiationActionQueryBuilderDsl {
    public QuoteRequestQuoteRenegotiationActionQueryBuilderDsl() {
    }

    public static QuoteRequestQuoteRenegotiationActionQueryBuilderDsl of() {
        return new QuoteRequestQuoteRenegotiationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestQuoteRenegotiationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQuoteRenegotiationActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestQuoteRenegotiationActionQueryBuilderDsl> buyerComment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerComment")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestQuoteRenegotiationActionQueryBuilderDsl::of));
    }
}
