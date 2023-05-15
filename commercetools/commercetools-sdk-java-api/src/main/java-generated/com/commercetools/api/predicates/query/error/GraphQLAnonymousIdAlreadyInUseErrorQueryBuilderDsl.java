
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl {
    public GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl() {
    }

    public static GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl of() {
        return new GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAnonymousIdAlreadyInUseErrorQueryBuilderDsl::of));
    }
}
