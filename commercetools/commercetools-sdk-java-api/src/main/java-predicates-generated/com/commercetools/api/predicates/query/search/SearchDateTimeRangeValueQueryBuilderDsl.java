
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchDateTimeRangeValueQueryBuilderDsl {
    public SearchDateTimeRangeValueQueryBuilderDsl() {
    }

    public static SearchDateTimeRangeValueQueryBuilderDsl of() {
        return new SearchDateTimeRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchDateTimeRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchDateTimeRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchDateTimeRangeValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SearchDateTimeRangeValueQueryBuilderDsl> gte() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, SearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SearchDateTimeRangeValueQueryBuilderDsl> gt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, SearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SearchDateTimeRangeValueQueryBuilderDsl> lte() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, SearchDateTimeRangeValueQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SearchDateTimeRangeValueQueryBuilderDsl> lt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, SearchDateTimeRangeValueQueryBuilderDsl::of));
    }

}
