
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl {
    public GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl() {
    }

    public static GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl of() {
        return new GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMaxCartDiscountsReachedErrorQueryBuilderDsl::of));
    }

}
