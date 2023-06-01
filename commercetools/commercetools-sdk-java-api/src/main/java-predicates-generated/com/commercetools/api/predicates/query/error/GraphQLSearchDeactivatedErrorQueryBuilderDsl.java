package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLSearchDeactivatedErrorQueryBuilderDsl  {
    public GraphQLSearchDeactivatedErrorQueryBuilderDsl() {
    }

    public static GraphQLSearchDeactivatedErrorQueryBuilderDsl of() {
        return new GraphQLSearchDeactivatedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLSearchDeactivatedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLSearchDeactivatedErrorQueryBuilderDsl::of));
    }
    
}
