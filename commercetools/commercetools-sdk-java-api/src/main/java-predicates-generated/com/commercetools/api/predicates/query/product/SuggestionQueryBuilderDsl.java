
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class SuggestionQueryBuilderDsl {
    public SuggestionQueryBuilderDsl() {
    }

    public static SuggestionQueryBuilderDsl of() {
        return new SuggestionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SuggestionQueryBuilderDsl> text() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("text")),
            p -> new CombinationQueryPredicate<>(p, SuggestionQueryBuilderDsl::of));
    }

}
