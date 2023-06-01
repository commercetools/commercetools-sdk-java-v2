package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLInternalConstraintViolatedErrorQueryBuilderDsl  {
    public GraphQLInternalConstraintViolatedErrorQueryBuilderDsl() {
    }

    public static GraphQLInternalConstraintViolatedErrorQueryBuilderDsl of() {
        return new GraphQLInternalConstraintViolatedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInternalConstraintViolatedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInternalConstraintViolatedErrorQueryBuilderDsl::of));
    }
    
}
