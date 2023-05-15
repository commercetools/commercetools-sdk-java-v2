
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLInvalidInputErrorQueryBuilderDsl {
    public GraphQLInvalidInputErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidInputErrorQueryBuilderDsl of() {
        return new GraphQLInvalidInputErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidInputErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLInvalidInputErrorQueryBuilderDsl::of));
    }
}
