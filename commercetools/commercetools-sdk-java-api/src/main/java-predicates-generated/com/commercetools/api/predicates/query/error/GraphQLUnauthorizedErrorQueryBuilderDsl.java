
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLUnauthorizedErrorQueryBuilderDsl {
    public GraphQLUnauthorizedErrorQueryBuilderDsl() {
    }

    public static GraphQLUnauthorizedErrorQueryBuilderDsl of() {
        return new GraphQLUnauthorizedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLUnauthorizedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLUnauthorizedErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<GraphQLUnauthorizedErrorQueryBuilderDsl> storesWithoutPermission() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storesWithoutPermission")),
            p -> new CombinationQueryPredicate<>(p, GraphQLUnauthorizedErrorQueryBuilderDsl::of));
    }

}
