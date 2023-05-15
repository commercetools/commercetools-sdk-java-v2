
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLErrorObjectQueryBuilderDsl {
    public GraphQLErrorObjectQueryBuilderDsl() {
    }

    public static GraphQLErrorObjectQueryBuilderDsl of() {
        return new GraphQLErrorObjectQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLErrorObjectQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLErrorObjectQueryBuilderDsl::of));
    }
}
