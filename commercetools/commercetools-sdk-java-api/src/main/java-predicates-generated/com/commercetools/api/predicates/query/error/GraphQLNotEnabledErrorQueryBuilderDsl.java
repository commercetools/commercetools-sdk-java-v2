package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLNotEnabledErrorQueryBuilderDsl  {
    public GraphQLNotEnabledErrorQueryBuilderDsl() {
    }

    public static GraphQLNotEnabledErrorQueryBuilderDsl of() {
        return new GraphQLNotEnabledErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLNotEnabledErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLNotEnabledErrorQueryBuilderDsl::of));
    }
    
}
