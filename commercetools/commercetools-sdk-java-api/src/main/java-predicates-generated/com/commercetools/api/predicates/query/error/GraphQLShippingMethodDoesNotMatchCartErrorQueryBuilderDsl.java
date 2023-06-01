package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl  {
    public GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl() {
    }

    public static GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl of() {
        return new GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl::of));
    }
    
}
