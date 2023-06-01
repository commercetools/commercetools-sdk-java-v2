package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLInsufficientScopeErrorQueryBuilderDsl  {
    public GraphQLInsufficientScopeErrorQueryBuilderDsl() {
    }

    public static GraphQLInsufficientScopeErrorQueryBuilderDsl of() {
        return new GraphQLInsufficientScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInsufficientScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInsufficientScopeErrorQueryBuilderDsl::of));
    }
    
}
