
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLRecurringOrderFailureErrorQueryBuilderDsl {
    public GraphQLRecurringOrderFailureErrorQueryBuilderDsl() {
    }

    public static GraphQLRecurringOrderFailureErrorQueryBuilderDsl of() {
        return new GraphQLRecurringOrderFailureErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLRecurringOrderFailureErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLRecurringOrderFailureErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLRecurringOrderFailureErrorQueryBuilderDsl> details() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("details")),
            p -> new CombinationQueryPredicate<>(p, GraphQLRecurringOrderFailureErrorQueryBuilderDsl::of));
    }

}
