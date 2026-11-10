
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchExactValueQueryBuilderDsl {
    public SearchExactValueQueryBuilderDsl() {
    }

    public static SearchExactValueQueryBuilderDsl of() {
        return new SearchExactValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchExactValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchExactValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchExactValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchExactValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchExactValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchExactValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchExactValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, SearchExactValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchExactValueQueryBuilderDsl> values() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
            p -> new CombinationQueryPredicate<>(p, SearchExactValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchExactValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, SearchExactValueQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<SearchExactValueQueryBuilderDsl> caseInsensitive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("caseInsensitive")),
            p -> new CombinationQueryPredicate<>(p, SearchExactValueQueryBuilderDsl::of));
    }

}
