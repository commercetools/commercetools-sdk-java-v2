
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl {
    public GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl() {
    }

    public static GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl of() {
        return new GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMaxDiscountGroupsReachedErrorQueryBuilderDsl::of));
    }

}
