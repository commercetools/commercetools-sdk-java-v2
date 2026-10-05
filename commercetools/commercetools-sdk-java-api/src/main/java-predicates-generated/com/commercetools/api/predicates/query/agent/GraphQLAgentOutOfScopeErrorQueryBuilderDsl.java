
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentOutOfScopeErrorQueryBuilderDsl {
    public GraphQLAgentOutOfScopeErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentOutOfScopeErrorQueryBuilderDsl of() {
        return new GraphQLAgentOutOfScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentOutOfScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentOutOfScopeErrorQueryBuilderDsl::of));
    }

}
