
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class SearchFacetPathNotFoundErrorQueryBuilderDsl {
    public SearchFacetPathNotFoundErrorQueryBuilderDsl() {
    }

    public static SearchFacetPathNotFoundErrorQueryBuilderDsl of() {
        return new SearchFacetPathNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchFacetPathNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, SearchFacetPathNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFacetPathNotFoundErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, SearchFacetPathNotFoundErrorQueryBuilderDsl::of));
    }
}
