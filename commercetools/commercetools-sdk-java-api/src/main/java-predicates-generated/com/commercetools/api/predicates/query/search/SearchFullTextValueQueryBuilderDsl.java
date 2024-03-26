
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchFullTextValueQueryBuilderDsl {
    public SearchFullTextValueQueryBuilderDsl() {
    }

    public static SearchFullTextValueQueryBuilderDsl of() {
        return new SearchFullTextValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchFullTextValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchFullTextValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextValueQueryBuilderDsl> mustMatch() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mustMatch")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextValueQueryBuilderDsl::of));
    }

}
