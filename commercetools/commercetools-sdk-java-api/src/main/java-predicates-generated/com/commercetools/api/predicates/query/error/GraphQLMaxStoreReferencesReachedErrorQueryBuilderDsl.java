
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl {
    public GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl() {
    }

    public static GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl of() {
        return new GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMaxStoreReferencesReachedErrorQueryBuilderDsl::of));
    }

}
