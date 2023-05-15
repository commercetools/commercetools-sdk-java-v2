
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLInvalidTokenErrorQueryBuilderDsl {
    public GraphQLInvalidTokenErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidTokenErrorQueryBuilderDsl of() {
        return new GraphQLInvalidTokenErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidTokenErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLInvalidTokenErrorQueryBuilderDsl::of));
    }
}
