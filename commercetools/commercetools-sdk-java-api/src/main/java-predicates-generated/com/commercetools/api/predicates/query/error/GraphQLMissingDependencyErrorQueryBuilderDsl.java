
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLMissingDependencyErrorQueryBuilderDsl {
    public GraphQLMissingDependencyErrorQueryBuilderDsl() {
    }

    public static GraphQLMissingDependencyErrorQueryBuilderDsl of() {
        return new GraphQLMissingDependencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMissingDependencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMissingDependencyErrorQueryBuilderDsl::of));
    }

}
