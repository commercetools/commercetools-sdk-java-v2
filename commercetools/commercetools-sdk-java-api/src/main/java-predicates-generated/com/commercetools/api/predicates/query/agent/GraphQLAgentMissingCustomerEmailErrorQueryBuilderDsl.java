
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentMissingCustomerEmailErrorQueryBuilderDsl {
    public GraphQLAgentMissingCustomerEmailErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentMissingCustomerEmailErrorQueryBuilderDsl of() {
        return new GraphQLAgentMissingCustomerEmailErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentMissingCustomerEmailErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentMissingCustomerEmailErrorQueryBuilderDsl::of));
    }

}
