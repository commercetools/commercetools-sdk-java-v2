
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLInvalidOperationErrorQueryBuilderDsl {
    public GraphQLInvalidOperationErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidOperationErrorQueryBuilderDsl of() {
        return new GraphQLInvalidOperationErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidOperationErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLInvalidOperationErrorQueryBuilderDsl::of));
    }
}
