
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentProductSearchNotEnabledErrorQueryBuilderDsl {
    public GraphQLAgentProductSearchNotEnabledErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentProductSearchNotEnabledErrorQueryBuilderDsl of() {
        return new GraphQLAgentProductSearchNotEnabledErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentProductSearchNotEnabledErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentProductSearchNotEnabledErrorQueryBuilderDsl::of));
    }

}
