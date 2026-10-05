
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLExtensionCircularDependencyErrorQueryBuilderDsl {
    public GraphQLExtensionCircularDependencyErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionCircularDependencyErrorQueryBuilderDsl of() {
        return new GraphQLExtensionCircularDependencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionCircularDependencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionCircularDependencyErrorQueryBuilderDsl::of));
    }

}
