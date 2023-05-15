
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl {
    public GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl() {
    }

    public static GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl of() {
        return new GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl> exceededResource() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("exceededResource")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMaxResourceLimitExceededErrorQueryBuilderDsl::of));
    }
}
