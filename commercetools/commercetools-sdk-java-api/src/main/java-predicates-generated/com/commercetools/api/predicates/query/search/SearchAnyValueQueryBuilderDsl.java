
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchAnyValueQueryBuilderDsl {
    public SearchAnyValueQueryBuilderDsl() {
    }

    public static SearchAnyValueQueryBuilderDsl of() {
        return new SearchAnyValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchAnyValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchAnyValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchAnyValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchAnyValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchAnyValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, SearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchAnyValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, SearchAnyValueQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<SearchAnyValueQueryBuilderDsl> caseInsensitive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("caseInsensitive")),
            p -> new CombinationQueryPredicate<>(p, SearchAnyValueQueryBuilderDsl::of));
    }

}
