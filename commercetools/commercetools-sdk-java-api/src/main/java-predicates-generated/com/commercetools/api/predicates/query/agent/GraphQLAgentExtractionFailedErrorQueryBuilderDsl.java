
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentExtractionFailedErrorQueryBuilderDsl {
    public GraphQLAgentExtractionFailedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentExtractionFailedErrorQueryBuilderDsl of() {
        return new GraphQLAgentExtractionFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentExtractionFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentExtractionFailedErrorQueryBuilderDsl::of));
    }

}
