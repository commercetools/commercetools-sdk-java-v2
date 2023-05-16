
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestDeletedMessagePayloadQueryBuilderDsl {
    public QuoteRequestDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteRequestDeletedMessagePayloadQueryBuilderDsl of() {
        return new QuoteRequestDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
