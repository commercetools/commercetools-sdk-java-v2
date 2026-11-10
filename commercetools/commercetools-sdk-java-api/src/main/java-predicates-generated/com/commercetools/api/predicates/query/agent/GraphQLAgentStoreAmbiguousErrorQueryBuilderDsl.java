
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentStoreAmbiguousErrorQueryBuilderDsl {
    public GraphQLAgentStoreAmbiguousErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentStoreAmbiguousErrorQueryBuilderDsl of() {
        return new GraphQLAgentStoreAmbiguousErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentStoreAmbiguousErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentStoreAmbiguousErrorQueryBuilderDsl::of));
    }

}
