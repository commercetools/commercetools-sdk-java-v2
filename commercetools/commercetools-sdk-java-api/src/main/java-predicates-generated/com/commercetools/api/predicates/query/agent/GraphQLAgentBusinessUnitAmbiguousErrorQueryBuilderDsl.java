
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentBusinessUnitAmbiguousErrorQueryBuilderDsl {
    public GraphQLAgentBusinessUnitAmbiguousErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentBusinessUnitAmbiguousErrorQueryBuilderDsl of() {
        return new GraphQLAgentBusinessUnitAmbiguousErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentBusinessUnitAmbiguousErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentBusinessUnitAmbiguousErrorQueryBuilderDsl::of));
    }

}
