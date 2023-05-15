
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class SearchExecutionFailureErrorQueryBuilderDsl {
    public SearchExecutionFailureErrorQueryBuilderDsl() {
    }

    public static SearchExecutionFailureErrorQueryBuilderDsl of() {
        return new SearchExecutionFailureErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchExecutionFailureErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, SearchExecutionFailureErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchExecutionFailureErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, SearchExecutionFailureErrorQueryBuilderDsl::of));
    }
}
