
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLSearchNotReadyErrorQueryBuilderDsl {
    public GraphQLSearchNotReadyErrorQueryBuilderDsl() {
    }

    public static GraphQLSearchNotReadyErrorQueryBuilderDsl of() {
        return new GraphQLSearchNotReadyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLSearchNotReadyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLSearchNotReadyErrorQueryBuilderDsl::of));
    }

}
