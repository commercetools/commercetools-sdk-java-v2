
package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

public class QuoteUpdateActionQueryBuilderDsl {
    public QuoteUpdateActionQueryBuilderDsl() {
    }

    public static QuoteUpdateActionQueryBuilderDsl of() {
        return new QuoteUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteUpdateActionQueryBuilderDsl::of));
    }
}
