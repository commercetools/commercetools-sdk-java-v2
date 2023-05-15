
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class SearchDeactivatedErrorQueryBuilderDsl {
    public SearchDeactivatedErrorQueryBuilderDsl() {
    }

    public static SearchDeactivatedErrorQueryBuilderDsl of() {
        return new SearchDeactivatedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchDeactivatedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, SearchDeactivatedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchDeactivatedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, SearchDeactivatedErrorQueryBuilderDsl::of));
    }
}
