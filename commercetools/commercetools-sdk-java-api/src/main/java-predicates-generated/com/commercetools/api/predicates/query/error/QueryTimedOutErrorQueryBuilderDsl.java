package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QueryTimedOutErrorQueryBuilderDsl  {
    public QueryTimedOutErrorQueryBuilderDsl() {
    }

    public static QueryTimedOutErrorQueryBuilderDsl of() {
        return new QueryTimedOutErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QueryTimedOutErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, QueryTimedOutErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QueryTimedOutErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, QueryTimedOutErrorQueryBuilderDsl::of));
    }
    
}
