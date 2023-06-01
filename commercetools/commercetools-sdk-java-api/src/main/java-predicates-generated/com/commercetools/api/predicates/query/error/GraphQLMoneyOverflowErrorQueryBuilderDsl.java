
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLMoneyOverflowErrorQueryBuilderDsl {
    public GraphQLMoneyOverflowErrorQueryBuilderDsl() {
    }

    public static GraphQLMoneyOverflowErrorQueryBuilderDsl of() {
        return new GraphQLMoneyOverflowErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMoneyOverflowErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMoneyOverflowErrorQueryBuilderDsl::of));
    }

}
