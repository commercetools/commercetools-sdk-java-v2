package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QueryComplexityLimitExceededErrorQueryBuilderDsl  {
    public QueryComplexityLimitExceededErrorQueryBuilderDsl() {
    }

    public static QueryComplexityLimitExceededErrorQueryBuilderDsl of() {
        return new QueryComplexityLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QueryComplexityLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, QueryComplexityLimitExceededErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QueryComplexityLimitExceededErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, QueryComplexityLimitExceededErrorQueryBuilderDsl::of));
    }
    
}
