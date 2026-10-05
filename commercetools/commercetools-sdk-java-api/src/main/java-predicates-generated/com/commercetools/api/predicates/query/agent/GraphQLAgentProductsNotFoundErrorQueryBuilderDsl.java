
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentProductsNotFoundErrorQueryBuilderDsl {
    public GraphQLAgentProductsNotFoundErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentProductsNotFoundErrorQueryBuilderDsl of() {
        return new GraphQLAgentProductsNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentProductsNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentProductsNotFoundErrorQueryBuilderDsl::of));
    }

}
