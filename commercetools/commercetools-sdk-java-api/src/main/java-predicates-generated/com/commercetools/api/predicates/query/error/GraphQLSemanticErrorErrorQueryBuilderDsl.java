package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLSemanticErrorErrorQueryBuilderDsl  {
    public GraphQLSemanticErrorErrorQueryBuilderDsl() {
    }

    public static GraphQLSemanticErrorErrorQueryBuilderDsl of() {
        return new GraphQLSemanticErrorErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLSemanticErrorErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLSemanticErrorErrorQueryBuilderDsl::of));
    }
    
}
