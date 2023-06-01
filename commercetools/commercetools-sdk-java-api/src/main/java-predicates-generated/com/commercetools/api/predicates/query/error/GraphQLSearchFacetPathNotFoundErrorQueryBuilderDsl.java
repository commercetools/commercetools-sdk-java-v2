package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl  {
    public GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl() {
    }

    public static GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl of() {
        return new GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLSearchFacetPathNotFoundErrorQueryBuilderDsl::of));
    }
    
}
