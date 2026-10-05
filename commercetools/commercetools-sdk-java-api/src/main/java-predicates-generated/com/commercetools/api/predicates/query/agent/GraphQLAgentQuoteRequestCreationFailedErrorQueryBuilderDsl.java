
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl {
    public GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl of() {
        return new GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl> cartId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartId")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentQuoteRequestCreationFailedErrorQueryBuilderDsl::of));
    }

}
