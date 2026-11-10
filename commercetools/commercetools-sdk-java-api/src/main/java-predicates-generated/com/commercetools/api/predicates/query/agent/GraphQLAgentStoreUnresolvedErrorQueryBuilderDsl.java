
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentStoreUnresolvedErrorQueryBuilderDsl {
    public GraphQLAgentStoreUnresolvedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentStoreUnresolvedErrorQueryBuilderDsl of() {
        return new GraphQLAgentStoreUnresolvedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentStoreUnresolvedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentStoreUnresolvedErrorQueryBuilderDsl::of));
    }

}
