
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLInvalidCredentialsErrorQueryBuilderDsl {
    public GraphQLInvalidCredentialsErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidCredentialsErrorQueryBuilderDsl of() {
        return new GraphQLInvalidCredentialsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidCredentialsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLInvalidCredentialsErrorQueryBuilderDsl::of));
    }
}
