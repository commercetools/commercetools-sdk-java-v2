
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLTooManyRequestsErrorQueryBuilderDsl {
    public GraphQLTooManyRequestsErrorQueryBuilderDsl() {
    }

    public static GraphQLTooManyRequestsErrorQueryBuilderDsl of() {
        return new GraphQLTooManyRequestsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLTooManyRequestsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLTooManyRequestsErrorQueryBuilderDsl::of));
    }

}
