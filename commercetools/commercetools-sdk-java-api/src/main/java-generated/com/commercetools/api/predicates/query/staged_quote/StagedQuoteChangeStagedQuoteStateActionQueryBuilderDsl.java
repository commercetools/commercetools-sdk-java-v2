
package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl {
    public StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl() {
    }

    public static StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl of() {
        return new StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl> stagedQuoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedQuoteState")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl::of));
    }
}
