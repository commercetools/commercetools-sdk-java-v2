
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentMissingCurrencyErrorQueryBuilderDsl {
    public GraphQLAgentMissingCurrencyErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentMissingCurrencyErrorQueryBuilderDsl of() {
        return new GraphQLAgentMissingCurrencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentMissingCurrencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentMissingCurrencyErrorQueryBuilderDsl::of));
    }

}
