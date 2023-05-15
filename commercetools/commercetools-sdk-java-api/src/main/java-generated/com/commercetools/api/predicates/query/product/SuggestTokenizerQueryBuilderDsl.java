
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class SuggestTokenizerQueryBuilderDsl {
    public SuggestTokenizerQueryBuilderDsl() {
    }

    public static SuggestTokenizerQueryBuilderDsl of() {
        return new SuggestTokenizerQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SuggestTokenizerQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, SuggestTokenizerQueryBuilderDsl::of));
    }
}
