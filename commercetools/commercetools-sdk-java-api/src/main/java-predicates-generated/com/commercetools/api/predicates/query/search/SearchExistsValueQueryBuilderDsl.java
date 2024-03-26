
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchExistsValueQueryBuilderDsl {
    public SearchExistsValueQueryBuilderDsl() {
    }

    public static SearchExistsValueQueryBuilderDsl of() {
        return new SearchExistsValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchExistsValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchExistsValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchExistsValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchExistsValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchExistsValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchExistsValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchExistsValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, SearchExistsValueQueryBuilderDsl::of));
    }

}
