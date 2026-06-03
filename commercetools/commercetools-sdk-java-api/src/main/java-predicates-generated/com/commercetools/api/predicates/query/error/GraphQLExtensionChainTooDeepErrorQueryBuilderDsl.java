
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLExtensionChainTooDeepErrorQueryBuilderDsl {
    public GraphQLExtensionChainTooDeepErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionChainTooDeepErrorQueryBuilderDsl of() {
        return new GraphQLExtensionChainTooDeepErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionChainTooDeepErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionChainTooDeepErrorQueryBuilderDsl::of));
    }

}
