
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchTimeRangeValueQueryBuilderDsl {
    public SearchTimeRangeValueQueryBuilderDsl() {
    }

    public static SearchTimeRangeValueQueryBuilderDsl of() {
        return new SearchTimeRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchTimeRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchTimeRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchTimeRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchTimeRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchTimeRangeValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<SearchTimeRangeValueQueryBuilderDsl> gte() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, SearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<SearchTimeRangeValueQueryBuilderDsl> gt() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, SearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<SearchTimeRangeValueQueryBuilderDsl> lte() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, SearchTimeRangeValueQueryBuilderDsl::of));
    }

    public TimeComparisonPredicateBuilder<SearchTimeRangeValueQueryBuilderDsl> lt() {
        return new TimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, SearchTimeRangeValueQueryBuilderDsl::of));
    }

}
