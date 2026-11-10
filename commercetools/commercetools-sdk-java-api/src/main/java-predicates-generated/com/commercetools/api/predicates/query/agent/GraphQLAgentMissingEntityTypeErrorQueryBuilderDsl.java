
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentMissingEntityTypeErrorQueryBuilderDsl {
    public GraphQLAgentMissingEntityTypeErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentMissingEntityTypeErrorQueryBuilderDsl of() {
        return new GraphQLAgentMissingEntityTypeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentMissingEntityTypeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentMissingEntityTypeErrorQueryBuilderDsl::of));
    }

}
