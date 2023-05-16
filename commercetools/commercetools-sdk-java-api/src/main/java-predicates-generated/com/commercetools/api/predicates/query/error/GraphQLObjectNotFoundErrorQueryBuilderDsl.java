
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLObjectNotFoundErrorQueryBuilderDsl {
    public GraphQLObjectNotFoundErrorQueryBuilderDsl() {
    }

    public static GraphQLObjectNotFoundErrorQueryBuilderDsl of() {
        return new GraphQLObjectNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLObjectNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLObjectNotFoundErrorQueryBuilderDsl::of));
    }

}
