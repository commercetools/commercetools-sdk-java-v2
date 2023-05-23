
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLSearchExecutionFailureErrorQueryBuilderDsl {
    public GraphQLSearchExecutionFailureErrorQueryBuilderDsl() {
    }

    public static GraphQLSearchExecutionFailureErrorQueryBuilderDsl of() {
        return new GraphQLSearchExecutionFailureErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLSearchExecutionFailureErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLSearchExecutionFailureErrorQueryBuilderDsl::of));
    }

}
