
package com.commercetools.api.predicates.query.quote_request;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl {
    public QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl() {
    }

    public static QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl of() {
        return new QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl> quoteRequestState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteRequestState")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl::of));
    }

}
