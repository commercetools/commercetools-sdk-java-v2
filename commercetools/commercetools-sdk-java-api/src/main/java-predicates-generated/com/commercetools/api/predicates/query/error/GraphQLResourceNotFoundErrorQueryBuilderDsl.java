
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLResourceNotFoundErrorQueryBuilderDsl {
    public GraphQLResourceNotFoundErrorQueryBuilderDsl() {
    }

    public static GraphQLResourceNotFoundErrorQueryBuilderDsl of() {
        return new GraphQLResourceNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLResourceNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLResourceNotFoundErrorQueryBuilderDsl::of));
    }

}
