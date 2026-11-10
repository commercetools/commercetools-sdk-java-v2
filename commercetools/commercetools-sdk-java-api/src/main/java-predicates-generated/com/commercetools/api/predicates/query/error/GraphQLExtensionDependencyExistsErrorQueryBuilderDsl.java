
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLExtensionDependencyExistsErrorQueryBuilderDsl {
    public GraphQLExtensionDependencyExistsErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionDependencyExistsErrorQueryBuilderDsl of() {
        return new GraphQLExtensionDependencyExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionDependencyExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionDependencyExistsErrorQueryBuilderDsl::of));
    }

}
