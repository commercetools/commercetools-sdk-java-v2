package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl  {
    public GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl of() {
        return new GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidCurrentPasswordErrorQueryBuilderDsl::of));
    }
    
}
