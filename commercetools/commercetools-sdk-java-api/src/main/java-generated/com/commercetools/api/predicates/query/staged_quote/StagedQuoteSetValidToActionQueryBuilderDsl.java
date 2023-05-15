
package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteSetValidToActionQueryBuilderDsl {
    public StagedQuoteSetValidToActionQueryBuilderDsl() {
    }

    public static StagedQuoteSetValidToActionQueryBuilderDsl of() {
        return new StagedQuoteSetValidToActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteSetValidToActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSetValidToActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteSetValidToActionQueryBuilderDsl> validTo() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validTo")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSetValidToActionQueryBuilderDsl::of));
    }
}
