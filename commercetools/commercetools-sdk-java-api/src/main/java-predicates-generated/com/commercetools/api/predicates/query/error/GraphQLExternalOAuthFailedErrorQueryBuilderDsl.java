package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLExternalOAuthFailedErrorQueryBuilderDsl  {
    public GraphQLExternalOAuthFailedErrorQueryBuilderDsl() {
    }

    public static GraphQLExternalOAuthFailedErrorQueryBuilderDsl of() {
        return new GraphQLExternalOAuthFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExternalOAuthFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLExternalOAuthFailedErrorQueryBuilderDsl::of));
    }
    
}
