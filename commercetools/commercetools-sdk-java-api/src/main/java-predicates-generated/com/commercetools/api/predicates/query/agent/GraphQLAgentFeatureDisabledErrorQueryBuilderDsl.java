
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentFeatureDisabledErrorQueryBuilderDsl {
    public GraphQLAgentFeatureDisabledErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentFeatureDisabledErrorQueryBuilderDsl of() {
        return new GraphQLAgentFeatureDisabledErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentFeatureDisabledErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentFeatureDisabledErrorQueryBuilderDsl::of));
    }

}
