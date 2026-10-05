
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentBusinessUnitLimitExceededErrorQueryBuilderDsl {
    public GraphQLAgentBusinessUnitLimitExceededErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentBusinessUnitLimitExceededErrorQueryBuilderDsl of() {
        return new GraphQLAgentBusinessUnitLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentBusinessUnitLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentBusinessUnitLimitExceededErrorQueryBuilderDsl::of));
    }

}
