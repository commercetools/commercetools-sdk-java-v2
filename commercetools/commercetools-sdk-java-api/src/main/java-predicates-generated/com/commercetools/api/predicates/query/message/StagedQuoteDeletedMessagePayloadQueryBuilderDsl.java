
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteDeletedMessagePayloadQueryBuilderDsl {
    public StagedQuoteDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static StagedQuoteDeletedMessagePayloadQueryBuilderDsl of() {
        return new StagedQuoteDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
