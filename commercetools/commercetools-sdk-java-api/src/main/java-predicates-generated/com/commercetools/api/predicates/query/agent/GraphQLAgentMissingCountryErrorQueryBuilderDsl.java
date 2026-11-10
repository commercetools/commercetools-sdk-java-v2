
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentMissingCountryErrorQueryBuilderDsl {
    public GraphQLAgentMissingCountryErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentMissingCountryErrorQueryBuilderDsl of() {
        return new GraphQLAgentMissingCountryErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentMissingCountryErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentMissingCountryErrorQueryBuilderDsl::of));
    }

}
