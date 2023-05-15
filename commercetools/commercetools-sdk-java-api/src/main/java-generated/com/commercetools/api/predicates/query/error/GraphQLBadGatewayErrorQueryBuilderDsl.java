
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLBadGatewayErrorQueryBuilderDsl {
    public GraphQLBadGatewayErrorQueryBuilderDsl() {
    }

    public static GraphQLBadGatewayErrorQueryBuilderDsl of() {
        return new GraphQLBadGatewayErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLBadGatewayErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLBadGatewayErrorQueryBuilderDsl::of));
    }
}
