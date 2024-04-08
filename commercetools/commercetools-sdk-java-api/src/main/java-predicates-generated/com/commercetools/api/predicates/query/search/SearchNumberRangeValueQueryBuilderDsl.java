
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchNumberRangeValueQueryBuilderDsl {
    public SearchNumberRangeValueQueryBuilderDsl() {
    }

    public static SearchNumberRangeValueQueryBuilderDsl of() {
        return new SearchNumberRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchNumberRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchNumberRangeValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchNumberRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchNumberRangeValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchNumberRangeValueQueryBuilderDsl> gte() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, SearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchNumberRangeValueQueryBuilderDsl> gt() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gt")),
            p -> new CombinationQueryPredicate<>(p, SearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchNumberRangeValueQueryBuilderDsl> lte() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, SearchNumberRangeValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchNumberRangeValueQueryBuilderDsl> lt() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lt")),
            p -> new CombinationQueryPredicate<>(p, SearchNumberRangeValueQueryBuilderDsl::of));
    }

}
