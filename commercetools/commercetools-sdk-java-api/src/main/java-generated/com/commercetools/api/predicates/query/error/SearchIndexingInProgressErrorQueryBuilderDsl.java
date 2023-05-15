
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class SearchIndexingInProgressErrorQueryBuilderDsl {
    public SearchIndexingInProgressErrorQueryBuilderDsl() {
    }

    public static SearchIndexingInProgressErrorQueryBuilderDsl of() {
        return new SearchIndexingInProgressErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchIndexingInProgressErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, SearchIndexingInProgressErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchIndexingInProgressErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, SearchIndexingInProgressErrorQueryBuilderDsl::of));
    }
}
