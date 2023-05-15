
package com.commercetools.api.predicates.query.quote_request;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestUpdateActionQueryBuilderDsl {
    public QuoteRequestUpdateActionQueryBuilderDsl() {
    }

    public static QuoteRequestUpdateActionQueryBuilderDsl of() {
        return new QuoteRequestUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestUpdateActionQueryBuilderDsl::of));
    }
}
