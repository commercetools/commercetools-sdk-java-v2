
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLGeneralErrorQueryBuilderDsl {
    public GraphQLGeneralErrorQueryBuilderDsl() {
    }

    public static GraphQLGeneralErrorQueryBuilderDsl of() {
        return new GraphQLGeneralErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLGeneralErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLGeneralErrorQueryBuilderDsl::of));
    }

}
