
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchFuzzyValueQueryBuilderDsl {
    public SearchFuzzyValueQueryBuilderDsl() {
    }

    public static SearchFuzzyValueQueryBuilderDsl of() {
        return new SearchFuzzyValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchFuzzyValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchFuzzyValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchFuzzyValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchFuzzyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFuzzyValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchFuzzyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFuzzyValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, SearchFuzzyValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SearchFuzzyValueQueryBuilderDsl> level() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("level")),
            p -> new CombinationQueryPredicate<>(p, SearchFuzzyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFuzzyValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, SearchFuzzyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFuzzyValueQueryBuilderDsl> mustMatch() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mustMatch")),
            p -> new CombinationQueryPredicate<>(p, SearchFuzzyValueQueryBuilderDsl::of));
    }

}
