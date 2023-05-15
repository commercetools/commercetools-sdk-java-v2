
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLPendingOperationErrorQueryBuilderDsl {
    public GraphQLPendingOperationErrorQueryBuilderDsl() {
    }

    public static GraphQLPendingOperationErrorQueryBuilderDsl of() {
        return new GraphQLPendingOperationErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLPendingOperationErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLPendingOperationErrorQueryBuilderDsl::of));
    }
}
