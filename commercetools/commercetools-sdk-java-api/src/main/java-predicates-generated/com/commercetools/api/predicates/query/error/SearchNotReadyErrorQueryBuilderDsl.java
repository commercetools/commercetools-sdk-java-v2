
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class SearchNotReadyErrorQueryBuilderDsl {
    public SearchNotReadyErrorQueryBuilderDsl() {
    }

    public static SearchNotReadyErrorQueryBuilderDsl of() {
        return new SearchNotReadyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchNotReadyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, SearchNotReadyErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchNotReadyErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, SearchNotReadyErrorQueryBuilderDsl::of));
    }

}
