package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLSearchIndexingInProgressErrorQueryBuilderDsl  {
    public GraphQLSearchIndexingInProgressErrorQueryBuilderDsl() {
    }

    public static GraphQLSearchIndexingInProgressErrorQueryBuilderDsl of() {
        return new GraphQLSearchIndexingInProgressErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLSearchIndexingInProgressErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLSearchIndexingInProgressErrorQueryBuilderDsl::of));
    }
    
}
