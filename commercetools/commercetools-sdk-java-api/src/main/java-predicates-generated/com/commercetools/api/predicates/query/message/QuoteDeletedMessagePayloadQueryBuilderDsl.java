
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class QuoteDeletedMessagePayloadQueryBuilderDsl {
    public QuoteDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteDeletedMessagePayloadQueryBuilderDsl of() {
        return new QuoteDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
