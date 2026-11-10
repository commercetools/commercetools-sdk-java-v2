
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLExtensionChainTooWideErrorQueryBuilderDsl {
    public GraphQLExtensionChainTooWideErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionChainTooWideErrorQueryBuilderDsl of() {
        return new GraphQLExtensionChainTooWideErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionChainTooWideErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionChainTooWideErrorQueryBuilderDsl::of));
    }

}
