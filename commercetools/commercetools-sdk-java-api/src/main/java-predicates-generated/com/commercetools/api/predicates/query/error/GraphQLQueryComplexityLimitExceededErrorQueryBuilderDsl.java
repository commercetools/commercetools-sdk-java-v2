package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl  {
    public GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl() {
    }

    public static GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl of() {
        return new GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLQueryComplexityLimitExceededErrorQueryBuilderDsl::of));
    }
    
}
