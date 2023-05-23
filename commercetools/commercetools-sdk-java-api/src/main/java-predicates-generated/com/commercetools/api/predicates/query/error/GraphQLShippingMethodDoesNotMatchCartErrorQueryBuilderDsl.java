
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl {
    public GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl() {
    }

    public static GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl of() {
        return new GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLShippingMethodDoesNotMatchCartErrorQueryBuilderDsl::of));
    }

}
