
package com.commercetools.api.predicates.query.search;

import com.commercetools.api.predicates.query.*;

public class SearchFullTextPrefixValueQueryBuilderDsl {
    public SearchFullTextPrefixValueQueryBuilderDsl() {
    }

    public static SearchFullTextPrefixValueQueryBuilderDsl of() {
        return new SearchFullTextPrefixValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchFullTextPrefixValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextPrefixValueQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<SearchFullTextPrefixValueQueryBuilderDsl> boost() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextPrefixValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextPrefixValueQueryBuilderDsl> fieldType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldType")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextPrefixValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextPrefixValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextPrefixValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextPrefixValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextPrefixValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SearchFullTextPrefixValueQueryBuilderDsl> mustMatch() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mustMatch")),
            p -> new CombinationQueryPredicate<>(p, SearchFullTextPrefixValueQueryBuilderDsl::of));
    }

}
