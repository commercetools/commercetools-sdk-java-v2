
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLCircularDependencyErrorQueryBuilderDsl {
    public GraphQLCircularDependencyErrorQueryBuilderDsl() {
    }

    public static GraphQLCircularDependencyErrorQueryBuilderDsl of() {
        return new GraphQLCircularDependencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLCircularDependencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLCircularDependencyErrorQueryBuilderDsl::of));
    }

}
