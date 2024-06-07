
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchDateRangeValueQueryBuilderDsl {
    public SearchDateRangeValueQueryBuilderDsl() {
    }

    public static SearchDateRangeValueQueryBuilderDsl of() {
        return new SearchDateRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchDateRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchDateRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchDateRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchDateRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchDateRangeValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<SearchDateRangeValueQueryBuilderDsl> gte() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, SearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<SearchDateRangeValueQueryBuilderDsl> gt() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, SearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<SearchDateRangeValueQueryBuilderDsl> lte() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, SearchDateRangeValueQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<SearchDateRangeValueQueryBuilderDsl> lt() {
        return new DateComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, SearchDateRangeValueQueryBuilderDsl::of));
    }

}
