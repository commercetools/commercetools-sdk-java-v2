
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentBusinessUnitUnresolvedErrorQueryBuilderDsl {
    public GraphQLAgentBusinessUnitUnresolvedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentBusinessUnitUnresolvedErrorQueryBuilderDsl of() {
        return new GraphQLAgentBusinessUnitUnresolvedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentBusinessUnitUnresolvedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentBusinessUnitUnresolvedErrorQueryBuilderDsl::of));
    }

}
