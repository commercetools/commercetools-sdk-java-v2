
package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteUpdateActionQueryBuilderDsl {
    public StagedQuoteUpdateActionQueryBuilderDsl() {
    }

    public static StagedQuoteUpdateActionQueryBuilderDsl of() {
        return new StagedQuoteUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteUpdateActionQueryBuilderDsl::of));
    }
}
