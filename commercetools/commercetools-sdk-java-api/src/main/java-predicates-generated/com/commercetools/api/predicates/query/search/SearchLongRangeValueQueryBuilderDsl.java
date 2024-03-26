
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchLongRangeValueQueryBuilderDsl {
    public SearchLongRangeValueQueryBuilderDsl() {
    }

    public static SearchLongRangeValueQueryBuilderDsl of() {
        return new SearchLongRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchLongRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchLongRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchLongRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchLongRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchLongRangeValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SearchLongRangeValueQueryBuilderDsl> gte() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, SearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SearchLongRangeValueQueryBuilderDsl> gt() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, SearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SearchLongRangeValueQueryBuilderDsl> lte() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, SearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SearchLongRangeValueQueryBuilderDsl> lt() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, SearchLongRangeValueQueryBuilderDsl::of));
    }

}
