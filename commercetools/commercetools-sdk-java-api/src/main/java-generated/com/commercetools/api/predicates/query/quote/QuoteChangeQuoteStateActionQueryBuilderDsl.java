
package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

public class QuoteChangeQuoteStateActionQueryBuilderDsl {
    public QuoteChangeQuoteStateActionQueryBuilderDsl() {
    }

    public static QuoteChangeQuoteStateActionQueryBuilderDsl of() {
        return new QuoteChangeQuoteStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteChangeQuoteStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteChangeQuoteStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteChangeQuoteStateActionQueryBuilderDsl> quoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteState")),
            p -> new CombinationQueryPredicate<>(p, QuoteChangeQuoteStateActionQueryBuilderDsl::of));
    }
}
