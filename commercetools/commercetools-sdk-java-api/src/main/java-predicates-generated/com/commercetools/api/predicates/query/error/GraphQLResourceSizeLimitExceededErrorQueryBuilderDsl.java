package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl  {
    public GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl() {
    }

    public static GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl of() {
        return new GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLResourceSizeLimitExceededErrorQueryBuilderDsl::of));
    }
    
}
