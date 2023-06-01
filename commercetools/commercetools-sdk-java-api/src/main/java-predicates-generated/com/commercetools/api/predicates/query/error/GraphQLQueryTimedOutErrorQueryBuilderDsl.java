package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLQueryTimedOutErrorQueryBuilderDsl  {
    public GraphQLQueryTimedOutErrorQueryBuilderDsl() {
    }

    public static GraphQLQueryTimedOutErrorQueryBuilderDsl of() {
        return new GraphQLQueryTimedOutErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLQueryTimedOutErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLQueryTimedOutErrorQueryBuilderDsl::of));
    }
    
}
